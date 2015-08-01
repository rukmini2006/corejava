import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


public interface EmployeeService {
	
	public List<Employee> getEmployeeDetails(int id);
	public boolean setNewSalary(int emp_id,double sal);
	public void closeConnections() ;

}
