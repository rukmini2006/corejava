import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDaoImpl implements EmpDao {
	
	static Connection con =null;
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// @SuppressWarnings("unchecked")
	// @SuppressWarnings("unchecked")
	public List<Employee> getEmployeeDetails(int salary) {
		try {
			
		//	Statement stmt = con.createStatement();
			//ResultSet rs = stmt
				//	.executeQuery("select * from employees where salary>4000");
			 PreparedStatement ps = con.prepareStatement("select * from employees where salary>(?)");
			 ps.setInt(1, salary);
			// ResultSet rs = stmt.executeQuery();
			 ResultSet rs = ps.executeQuery();
			List<Employee> EmpList = new ArrayList<Employee>();
			System.out.println("Hi before rs ");
			while (rs.next()) {
				System.out.println(rs.getString("EMPLOYEE_ID") + " "
						+ rs.getString("FIRST_NAME") + " "
						+ rs.getInt("salary"));
				Employee emp = new Employee();

				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setSalary(rs.getDouble("salary"));
				EmpList.add(emp);
				// System.out.println(EmpList);
			}
			//System.out.println(EmpList);
			// while(((ResultSet) rs).next()){
			// List<Employee> EmpList = new ArrayList<Employee>();
			/*
			 * while(rs.next()){ Employee emp = new Employee();
			 * emp.setFirstName( rs.getString("FIRST_NAME"));
			 * emp.setSalary(rs.getInt("salary")); EmpList.add(emp);
			 * //System.out.println(rs.getString("EMAIL")+" "+
			 * rs.getString("FIRST_NAME")+ rs.getInt("SALARY")); }
			 */
			return EmpList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OPPS in EMPDOAL IMPL..ruturning NULL");
		return null;
	}

	@Override
	public boolean setNewSalary(int emp_id, double sal) {
		try {
			PreparedStatement ps =con.prepareStatement("UPDATE employees SET SALARY = ? WHERE EMPLOYEE_ID =?" );
			ps.setDouble(1, sal);
			ps.setInt(2, emp_id);
			int rs1 = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return false;
	}

}
