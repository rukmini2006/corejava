import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDaoImpl implements EmpDao {

	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Employee> getEmployeeDetails(int salary) {
		try {
			
			ps = con.prepareStatement("select * from employees where salary>(?)");
			ps.setInt(1, salary);
			ResultSet rs = ps.executeQuery();
			List<Employee> EmpList = new ArrayList<Employee>();
			while (rs.next()) {
				System.out.println(rs.getString("EMPLOYEE_ID") + " "
						+ rs.getString("FIRST_NAME") + " "
						+ rs.getInt("salary"));
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setSalary(rs.getDouble("salary"));
				EmpList.add(emp);

			}
			return EmpList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean setNewSalary(int emp_id, double sal) {
		try {
			ps = con.prepareStatement("UPDATE employees SET SALARY = ? WHERE EMPLOYEE_ID =?");
			ps.setDouble(1, sal);
			ps.setInt(2, emp_id);
			int rs1 = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public void closeConnections() {
		try {
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
