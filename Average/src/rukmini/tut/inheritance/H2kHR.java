package rukmini.tut.inheritance;

import rukmini.tut.inheritance.itemp.ITEmployee;
import rukmini.tut.inheritance.itemp.JavaEmp;

public class H2kHR {

	public static void main(String[] args) {
		
		FinanceEmployee fe = new FinanceEmployee(34,"rukmini");
		
		System.out.println(fe.getEmpId());
		System.out.println(fe.getName());
		System.out.println(fe.getWorkDetails());
		System.out.println(fe.tieColor());

		ITEmployee it = new JavaEmp(45,"prakash");
		System.out.println(it.getWorkDetails());
		System.out.println(it.getName());
		System.out.println(it.tieColor());
		
		ITEmployee it2 = new ITEmployee(45,"prakash"){
			@Override
			public String tieColor(){
				return "Golden  color tie";
				
			}
			
		};
		System.out.println(it2.tieColor());
		System.out.println(fe.toString());
	
		
		H2kEmployee emp = new FinanceEmployee(65,"prakash");
		emp.getEmpId();
	//	emp.getTax();
		
				
		FinanceEmployee fEmp = new FinanceEmployee(32, "baba");
		printInformation(fEmp);
		fEmp.tieColor();
		
		ITEmployee itEmp = new JavaEmp(333, "siri");
		itEmp.tieColor();
		
		printInformation(itEmp);
		
		 emp =new JavaEmp(344, "ffff");
		
		
	}
	public static void printInformation(H2kEmployee emp) {
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getWorkDetails());
	   
		
	}

}
