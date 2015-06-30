package rukmini.tut.inheritance;

public class FinanceEmployee extends H2kEmployee {
	
	private String tax;
	
	public FinanceEmployee(int empId,String name ) {
	super(empId,name);
	}
	
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	
	@Override
	public String getWorkDetails() {
		return "working hours for FinanceEmployee is 12hrs";
	}
	@Override
	public String tieColor(){
		return "tie color is purple";
		
	}

	@Override
	public void vehicle() {
		System.out.println("BMW");
		
	}
	@Override
	public void lunchTime() {
		// TODO Auto-generated method stub
		System.out.println("Lunch time is 12:00 p.m ");
	}
	
	
	

	

}
