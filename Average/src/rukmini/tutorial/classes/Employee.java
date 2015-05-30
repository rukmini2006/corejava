package rukmini.tutorial.classes;

public class Employee {
	
	String employeeName;
	double employeeSalary;
	int employeeId;
	String gender;
	
public Employee(String employeeName,int  employeeId){
	this.employeeName = employeeName;
	this.employeeId = employeeId;
	//public  Employee(String name,int id){
	//employeeName = name;
	//employeeId = id;
    //}
	}

public Employee(String name,int  id,double salary){
	this(name,id);
	employeeSalary = salary;
	}
    //public Employee(String employeeName,int  employeeId.double employeeSalary){
   //this(employeeName,employeeId)
	//this.employeeName = employeeName;
    //	this.employeeId = employeeId;
    //this.employeeSalary = employeeSalary;

	//public  Employee(String name,int id){
	//employeeName = name;
	//employeeId = id;
    //}
	

public Employee(String name,int  id,double salary,String assignGender){
	this(name,id,salary);
	gender = assignGender;
	}

public Employee(String name,int id,String assignGender ){
	//employeeName = name;
	//employeeId = id;
	this(name,id);
	gender = assignGender;
}
}

