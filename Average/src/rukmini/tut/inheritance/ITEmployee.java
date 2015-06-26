package rukmini.tut.inheritance;

public class ITEmployee extends H2kEmployee {
	
	public ITEmployee(int empId, String name) {
		super(empId, name);
		// TODO Auto-generated constructor stub
	}

	private String javaProgramingExp;

	public String getJavaProgramingExp() {
		return javaProgramingExp;
	}

	public void setJavaProgramingExp(String javaProgramingExp) {
		this.javaProgramingExp = javaProgramingExp;
	}

}
