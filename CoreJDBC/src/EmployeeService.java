import java.sql.ResultSet;
import java.util.List;


public interface EmployeeService {
	
	public List<Employee> getEmployeeDetails(int id);
	public boolean setNewSalary(int emp_id,double sal);
	

}
