package rukmini.tut.classes;

public class ReturnTypeExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ReturnTypeExample rte = new ReturnTypeExample();
		Calculation cal = new Calculation();
		cal.add(4, 5);
		cal.doCalculation(2, 3);
		//int d;
		/*rte.setInitialValue(9);
		rte.doCalculation(3,5);
		rte.doCalculation(4, 5,7);
		*/
		
		//String dou = rte.add(4, 6) + " ";
		
		/*System.out.println("Hello ");
		String name  = rte.getName("Dinesh","kumar");
		System.out.println("How u doing ");
		*/
		
		System.out.println("Hello " + rte.getName("Dinesh", "kumar")+"How r u ding?");
		
	}
	
	public String getName(String firstName,String lastName){
		System.out.println(firstName + " ******"+ lastName);
		return firstName + " ******"+ lastName;
		
		
	}

	
}
