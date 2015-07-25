package rukmini.tutorial;

//import java.io.FileWriter;
public class ThreadingExample   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(" one");
		//System.out.println("Two ");
	//	Sy/stem.out.println(" Three");
		//System.out.println("Thread name "+Thread.currentThread().getName());
	//	callMe();
		FileWriter run1 = new FileWriter();
		//Running run2 =new Running();
		Thread one = new Thread(run1,"rukmini");
		Thread two = new Thread(run1,"prakash");
		one.start();
		two.start();
		
	//	run1.start();
	//	run1.stop();
		//run1.start();
		//run2.start();
		System.out.println("Iam done ");

	}
public static void callMe(){
	System.out.println("ThreadingExample.callMe()" +Thread.currentThread().getName());
}
}
