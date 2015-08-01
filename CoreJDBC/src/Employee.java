
public class Employee {

	private  String firstName;
	private double salary;
	private double bonus;
	private int employeeId;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Employee(){
		
	}
	public Employee(int employeeId,double salary) {
		this.employeeId =employeeId;
		this.salary = salary;
	}
	public Employee(String name,double sal,double bon){
		firstName = name;
		salary =sal;
		bonus = bon;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
