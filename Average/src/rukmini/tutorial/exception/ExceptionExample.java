package rukmini.tutorial.exception;

import rukmini.tut.inheritance.itemp.JavaEmp;

public class ExceptionExample {

	public static void main(String[] args) {
		/*String name = null;
		System.out.println(name.length());
		// TODO Auto-generated method stub
		*/
		JavaEmp emp = null  ;
	//	System.out.println(emp!= null? emp.toString():" ");
		printEmp(emp);
		try {
			int  index = Integer.parseInt("2");
		} catch (Exception e1) {
			int index = 1000;
			e1.printStackTrace();
		}
		int ages [] = {23,45,67,78,100};
		int randomvalue[] = {1,3,0,5,8};
		
		System.out.println("Before ");
		int age = 0,value;
			//	System.out.println(age);
		System.out.println("After ");
		try{
			int index =  Integer.parseInt("2");
			age = ages[index ];
			value= randomvalue[index];
			int someValue = age/value;
			//close connection;
		}catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			age = 1000;
		}catch(ArithmeticException e){
			e.printStackTrace();
		}finally{
			System.out.println("Iam the finaslly block ");
		}
		System.out.println(age);
		if(age==1000) {
			System.out.println("Not sure ");
		}else if(age >30) {
			System.out.println("Age is more than 30 ");
		}else if(age <1){
			System.out.println("Iam kid ");
		}
		try {
			System.out.println("Division is"+Division.divideValues(12,0 ));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Iam at the final stage");

	}
	public static void printEmp(JavaEmp emp){
		System.out.println(emp != null ?emp.toString():" ");
	}
	
	

}
