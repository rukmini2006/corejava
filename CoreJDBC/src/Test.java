
public class Test {
	/**
	 * Static block gets invoked even before class is loaded
	 */
	static{
		System.out.println("Hi ");
		System.out.println("Hello ");
	}
	/**
	 * Constructor gets invoked after static block
	 */
	public Test(){
		System.out.println(" My name is Rukmini");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		

	}
	
}
