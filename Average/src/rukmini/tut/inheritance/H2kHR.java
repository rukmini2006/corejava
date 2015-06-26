package rukmini.tut.inheritance;

public class H2kHR {

	public static void main(String[] args) {
		
		FinanceEmployee fe = new FinanceEmployee(34,"rukmini");
		System.out.println(fe.getEmpId());
		System.out.println(fe.getName());
		System.out.println(fe.getWorkDetails());

		ITEmployee it = new ITEmployee(45,"prakash");
		System.out.println(it.getWorkDetails());
		System.out.println(it.getName());
	
	}

}
