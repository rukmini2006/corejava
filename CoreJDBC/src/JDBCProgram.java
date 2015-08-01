

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Types;

public class JDBCProgram {
	
	static Connection conn  = null;
	static Statement stmt =null;
	static PreparedStatement pstmt = null;
	static CallableStatement cs = null;
	static ResultSet rs = null;
	
	
	
	/*private static String jdbcOdbcBridgeDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
	private static String jdbcOdbcConnectionURL = "jdbc:odbc:StudentDSN";
	*/
	private static String oracleDriver = "oracle.jdbc.driver.OracleDriver";
	private static String connectionURL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String DB_USERNAME = "hr";
	private static final String DB_PASSWORD = "hr";
	

	public static void main(String[] args) throws SQLException {
		//System.out.println("in main");
		// TODO Auto-generated method stub

		//new JDBCProgram().selectQuery(206);
		
	//	new JDBCProgram().createTable();
		//new JDBCProgram().PreparedStatement(100,"Steven");
		//new JDBCProgram().createTable();
		//new JDBCProgram().insertIntoTAble(20,"rukmini");
	//	new JDBCProgram().createProcedureShowEmployees();
	//	new JDBCProgram().callProcedure();
		//new JDBCProgram().insertRowINDbAndRollBack(28,"twenty 8");
		//new JDBCProgram().addBatch();
		new JDBCProgram().savePoint();
	
		

	}
	static {
		try {
			Class.forName(oracleDriver);
			conn = DriverManager.getConnection(connectionURL, "hr", "hr");
			//conn = DriverManager.getConnection(connectionURL, DB_USERNAME, DB_PASSWORD);
		//	System.out.println("connection made??");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private static void closeConnections(ResultSet rs2, Statement stmt2,
			Connection conn2) {
		
		
	}

	
	public void selectQuery(int empid) {
			
		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from employees where employee_id = "+empid);
			while(rs.next()){
				System.out.println(rs.getString("EMAIL") + " "
                        + rs.getString("EMPLOYEE_ID") + " "
                        + rs.getString("first_name") + " "
                        + rs.getString("last_name"));
            }
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			closeConnections(rs,stmt,conn);
		}

}
	public void PreparedStatement(int empid,String firstname) {
		try {
			pstmt = conn.prepareStatement("select * from employees where employee_id = ? and first_name = ?");
			pstmt.setInt(1, empid);
			pstmt.setString(2, firstname);
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("first_name") + " " +rs.getString("last_name")+ " "+rs.getString(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeConnections(rs,stmt,conn);
		}
	}
	public static void createTable() {
		try {
			stmt = conn.createStatement();
			boolean hasResults = stmt.execute("CREATE TABLE H2KTABLESQL(id number(4 ),name VARCHAR(20))");
			System.out.println("HasResult  "+hasResults);
			System.out.println("Table got created ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeConnections(rs,stmt,conn);
		}
		
	}
	
	public static void insertIntoTAble(int empid,String firstname) {
		try {
			pstmt  = conn.prepareStatement("insert into H2KTABLESQL values(?,?)");
			pstmt.setInt(1, empid);
			pstmt.setString(2, firstname);
			int inValue = pstmt.executeUpdate();
			System.out.println("JDBCProgram().insertIntoTAble" +inValue);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void createProcedureShowEmployees() throws SQLException {
		String createProcedure = "CREATE OR REPLACE PROCEDURE SHOW_EMPLOYEES(EID_IN IN NUMBER,EMP_NAME OUT VARCHAR2)"
			+ "AS "
		+" BEGIN "
		+ "SELECT EMP.FIRST_NAME INTO EMP_NAME FROM EMPLOYEES EMP WHERE EMP.EMPLOYEE_ID = EID_IN;"
		+"END;"; 
		
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(createProcedure);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(stmt != null){
				stmt.close();
			}
		}
		/**
		 */
		
	}
	public  static void callProcedure() {
		
		try {
			cs = conn.prepareCall("{call SHOW_EMPLOYEES(?,?)}");
			cs.setInt(1, 100);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.executeQuery();
			String empName=cs.getString(2);
			System.out.println("JDBCProgram.callProcedure() "+empName);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			closeConnections(rs, stmt, conn);
		}
		
	}
	public static void insertRowINDbAndRollBack(int id,String name)  {
		
		try {
			conn.setAutoCommit(false);
			//for(int i =0;i<5;i++){
				pstmt = conn.prepareStatement("insert into H2kTableSQL values(?,?)");
				pstmt.setInt(1, id);
			
				
				pstmt.setString(2, name);
				
				int intValue = pstmt.executeUpdate();
				System.out.println("JDBCProgram.insertRowINDbAndRollBack " + intValue);
				
				
			//}
			
			//pstmt.setInt(1, Integer.parseInt(id+"a"));
			//pstmt.setString(2, name+"1");
			
			
			int i = 4 / 0;
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try{
				conn.rollback();
			}catch(Exception ex){
				ex.printStackTrace();
			}finally{
				closeConnections(rs, stmt, conn);
			}
			
		}
		
	}
	public static void addBatch() {
		try {
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			
			String sql1 = "INSERT INTO H2KTABLESQL " + "VALUES(107,'Rita')" ;
			stmt.addBatch(sql1);
			String sql2 = "INSERT INTO H2KTABLESQL " + "VALUES(105,'Rita')" ;
			stmt.addBatch(sql2);
			String sql3 = "INSERT INTO H2KTABLESQL " + "VALUES(106,'Rita')" ;
			stmt.addBatch(sql3);
			String sql4 = "UPDATE H2KTABLESQL  set name  ='Raja' where id = 102" ;
			stmt.addBatch(sql4);
			
			int[] intArray = stmt.executeBatch();
			conn.commit();
			System.out.println("commited successfully ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try{
				conn.rollback();
			}catch(Exception exp){
				exp.printStackTrace();
			}finally{
				closeConnections(rs, stmt, conn);
			}
		}
		
		
	}
	public static void savePoint() {
		Savepoint savepoint1 = null;
		Savepoint savepoint2 = null;
		
		try {
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			//set  a savepoint1
			savepoint1 = conn.setSavepoint("Savepoint1");
			String sql = "INSERT INTO H2KTABLESQL VALUES(102,'RIta')";
			stmt.executeUpdate(sql);
			
			savepoint2 = conn.setSavepoint("Savepoint2");
			String sql1 =  "INSERT INTO H2KTABLESQL VALUES(103,'RIta')";
			stmt.executeUpdate(sql1);
			
			int i = 4/0;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try{
				conn.rollback(savepoint2);
			}catch(Exception exp){
				exp.printStackTrace();
			}finally{
				closeConnections(rs, stmt, conn);
			}

		}
	}
	
}


