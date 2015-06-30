package rukmini.tut.inheritance;

public abstract class H2kEmployee  {
	
	private int empId;
	private String name;
	private String workDetails = "all Employees works for 8 hrs";
	
	public H2kEmployee(int empId,String name){
		this.empId = empId;
		this.name = name;
		//this.workDetails = workDetails;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkDetails() {
		return workDetails;
	}
	public void setWorkDetails(String workDetails) {
		this.workDetails = workDetails;
	}
	
	public abstract String tieColor();
	
	public abstract void vehicle();
	
	public void lunchTime(){
		System.out.println("Lunch time is  at 12:30p.m ");
	}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "empid = " + empId +" name =  " +name;
	
}
}
