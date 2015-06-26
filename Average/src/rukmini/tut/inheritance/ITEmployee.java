package rukmini.tut.inheritance;

public class ITEmployee extends H2kEmployee {
	
	public ITEmployee(int empId, String name) {
		super(empId, name);
		//super.setEmpId(empId); //Invoking super method
		// TODO Auto-generated constructor stub
	}

	private String javaProgramingExp;

	public String getJavaProgramingExp() {
		return javaProgramingExp;
	}

	public void setJavaProgramingExp(String javaProgramingExp) {
		this.javaProgramingExp = javaProgramingExp;
	}
	
	public String getWorkDetails() {
		return "work hrs for IT employee is 10hrs";
	}
	
	@Override
	public String tieColor(){
		return "tie color is black";
		
	}

}
