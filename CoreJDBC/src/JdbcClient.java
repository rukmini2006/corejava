import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class JdbcClient {

	public static void main(String[] args) throws SQLException {

		EmployeeService service = new EmployeeServiceImpl();
		List<Employee> EmpList = service.getEmployeeDetails(20000);

		System.out.println("======================== ");

		Iterator<Employee> itr = EmpList.iterator();
		while (itr.hasNext()) {
			Employee emp = (Employee) itr.next();
			//System.out.println(emp.getEmployeeId() + " " + emp.getSalary());

			double newSalary = emp.getSalary() + 2000;
			service.setNewSalary(emp.getEmployeeId(), newSalary);
			

		}
		service.closeConnections();

	}
}
