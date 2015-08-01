import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class JdbcClient {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	//	Employee emp = new Employee();
		EmployeeService service = new EmployeeServiceImpl();
		List<Employee>EmpList = service.getEmployeeDetails(4000);
		
		System.out.println("======================== ");
		Iterator itr = EmpList.iterator();
		while(itr.hasNext()){
		Employee emp =(Employee) itr.next();
			System.out.println(emp.getEmployeeId()+" "+emp.getSalary());
			
			double newSalary = emp.getSalary()+2000;
			service.setNewSalary(emp.getEmployeeId(),newSalary);
		
			
		}

		//System.out.println(EmpList);
		
		
	//rs.add((Employee) rs);
	
//while(rs.next()){
	//	System.out.println(rs.getString("employee_id")+"has salary of "+ rs.getInt("SALARY"));
//}
		
//System.out.println(list);
/*
List<Employee> newList = new ArrayList();
newList.addAll(list);
//System.out.println(newList);
*/
/*Iterator itr = list.iterator();
while(itr.hasNext()){
	if(itr.next()==null)
		break;
	*/
	//System.out.println(itr.next());;
	
	 /*emp=(Employee) itr.next();
	System.out.println(emp.getSalary());
	*/

//for(int i =0;i<=newList.size();i++){
	/*double salary =0;
	double bonus = 0;
	double newsalary= salary+bonus;
	emp.setBonus(2000);
	double newSal = emp.getSalary()+emp.getBonus();
	*/
	//System.out.println(newsalary);
	



	}
	public String toString(){
		return ("emp_id"+" "+"salary");
		
	}

}


