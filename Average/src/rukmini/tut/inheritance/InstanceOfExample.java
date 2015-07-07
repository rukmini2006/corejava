package rukmini.tut.inheritance;

import rukmini.tut.inheritance.itemp.JavaEmp;

public class InstanceOfExample {

	public static void main(String[] args) {
		H2kEmployee emp = new FinanceEmployee(34, "frank","6");
		printInformation(emp);
		
		 emp = new JavaEmp(45, "ashish");
		 printInformation(emp);
		

	}
	public static void printInformation(H2kEmployee emp){
		System.out.println(emp.getEmpId());
		if(emp instanceof FinanceEmployee){
			FinanceEmployee fe = (FinanceEmployee)emp;
			//FinanceEmployee fe = (H2kEmployee)emp;
			System.out.println(fe.getTax());
		}else if(emp instanceof JavaEmp){
			JavaEmp fe = (JavaEmp)emp;
			System.out.println(fe.objectOrientedConceptKnow());
		}
			
		
		
	}

}
