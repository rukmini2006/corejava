package rukmini.tutorial.thread.intercommunication;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.start();
		Reader rOne = new Reader(calc,"rumini");
		rOne.start();
		
		 new Reader(calc,"prakash").start();
		
		 new Reader(calc,"abhi").start();
		
		 new Reader(calc,"johnny").start();
		
		System.out.println("Final Result is  "+calc.sum);
	//	calc.sum;
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	//	System.out.println(calc.sum);
		

	}

}
