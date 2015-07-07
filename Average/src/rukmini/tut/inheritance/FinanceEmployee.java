package rukmini.tut.inheritance;




public class FinanceEmployee extends H2kEmployee implements Swimmable,Kickable {
	
	private String tax;
	
	public FinanceEmployee(int empId,String name ) {
	super(empId,name);
	}
	
	public FinanceEmployee(int empId,String name,String taxFinanceExp ) {
		super(empId,name);
		this.tax = taxFinanceExp;
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

	@Override
	public void swimming() {
		System.out.println("Iamgood at swiminig ");
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		System.out.println("Iam good at kicking ");
		
	}
	
	
	

	

}
