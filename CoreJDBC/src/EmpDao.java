import java.sql.ResultSet;
import java.util.List;


public interface EmpDao {

	public List<Employee> getEmployeeDetails(int salary);
	public boolean setNewSalary(int emp_id,double sal);
}
