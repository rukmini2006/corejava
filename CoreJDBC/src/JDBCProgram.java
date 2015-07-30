

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCProgram {
	
	static Connection conn  = null;
	static Statement stmt =null;
	static PreparedStatement pstmt = null;
	CallableStatement cs = null;
	static ResultSet rs = null;
	
	
	
	/*private static String jdbcOdbcBridgeDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
	private static String jdbcOdbcConnectionURL = "jdbc:odbc:StudentDSN";
	*/
	private static String oracleDriver = "oracle.jdbc.driver.OracleDriver";
	private static String connectionURL = "jdbc:oracle:thin:@localhost:1521/XE";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JDBCProgram().selectQuery(102);
		new JDBCProgram().PreparedStatement(100,"steven");
		new JDBCProgram().createTable();
		
		

	}
	static {
		try {
			Class.forName(oracleDriver);
			conn = DriverManager.getConnection(connectionURL);
			
			
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
		// TODO Auto-generated method stub
		
	}

	
	public void selectQuery(int empid) {
			
		try{
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from employees where employee id = "+empid);
			while(rs.next()){
				System.out.println(rs.getString("EMaIL") + " " +rs.getRow());
			}
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			closeConnections(rs,stmt,conn);
		}

}
	public void PreparedStatement(int empid,String firstname) {
		try {
			pstmt = conn.prepareStatement("select * from employees where emp_id = ? and first name = ?");
			pstmt.setInt(1, empid);
			pstmt.setString(2, firstname);
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("first name") + " " +rs.getInt(empid));
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
			boolean hasResults = stmt.execute("CREATE A TABLE H2KTABLE(id number(4 ),name VARCHAR(20)");
			System.out.println("HasResult  "+hasResults);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeConnections(rs,stmt,conn);
		}
		
	}
	
	
}


