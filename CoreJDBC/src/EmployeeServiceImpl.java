import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> getEmployeeDetails(int salary) {
		// TODO Auto-generated method stub
		EmpDao dao = new EmpDaoImpl();
		List<Employee>EmpList = dao.getEmployeeDetails(salary);

		return EmpList;
	}
	public boolean setNewSalary(int emp_id,double sal){
		EmpDao dao = new EmpDaoImpl();
		 return dao.setNewSalary(emp_id, sal);
	}

}
