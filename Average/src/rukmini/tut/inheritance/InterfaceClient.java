package rukmini.tut.inheritance;

import rukmini.tut.inheritance.itemp.JavaEmp;

public class InterfaceClient {

	public static void main(String[] args) {
		
	/*	H2kEmployee emp = new FinanceEmployee(23, "dasu");
	FinanceEmployee fe =(FinanceEmployee)emp;
	System.out.println(fe.getTax());*/
		
		Swimmable swim = new FinanceEmployee(65,"prakash","7");
		//swim.swimming();
		printSwimmingDetails(swim);
		
		Swimmable swim1 = new JavaEmp(344, "swathi");
		printSwimmingDetails(swim1);
		Kickable kick = new JavaEmp(12, "sahiti");
		kick.kick();
		
		FinanceEmployee fe1 = (FinanceEmployee) swim;
		System.out.println(fe1.getTax());
		/*Kickable kick = new JavaEmp(32, "reshma");
		kick.kick();
		*/
		

	}
	public static void printSwimmingDetails(Swimmable swim){
		swim.swimming();
		
	}

}
