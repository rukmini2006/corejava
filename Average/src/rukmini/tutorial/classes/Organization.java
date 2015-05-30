package rukmini.tutorial.classes;

public class Organization {

	public static void main(String[] args) {
		
		//This constructor defines name and id
		//emp1 is constructed with name,id
		Employee emp1 = new Employee("rukmini",4);
		
		System.out.println(emp1.employeeName);
		System.out.println(emp1.employeeId);
		System.out.println(emp1.employeeSalary);
		System.out.println(emp1.gender);
		
		//This constructor defines name id salary
		//emp2 is constructed with name,id ,salary
		
		Employee emp2 = new Employee("prakash",2,200000);
		
		//emp2.employeeName = "rukmini";
		System.out.println(emp2.employeeName);
		System.out.println(emp2.employeeId);
		System.out.println(emp2.employeeSalary);
		
		//This constructor defines name,id,salary,gender
		//emp3 is constructed with name,id,salary,gender
		
		Employee emp3 = new Employee("johnny",5,300000,"Male");
		System.out.println(emp3.employeeName);
		System.out.println(emp3.employeeId);
		System.out.println(emp3.employeeSalary);
		System.out.println(emp3.gender);
		
		
		
		
		
		
	}

}
