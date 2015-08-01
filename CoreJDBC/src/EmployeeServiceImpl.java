import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> getEmployeeDetails(int salary) {

		EmpDao dao = new EmpDaoImpl();
		List<Employee> EmpList = dao.getEmployeeDetails(salary);
		return EmpList;

	}

	public boolean setNewSalary(int emp_id, double sal) {

		EmpDao dao = new EmpDaoImpl();
		return dao.setNewSalary(emp_id, sal);
	}

	@Override
	public void closeConnections() {
		
		EmpDao dao = new EmpDaoImpl();
		dao.closeConnections();
		
	}

}
