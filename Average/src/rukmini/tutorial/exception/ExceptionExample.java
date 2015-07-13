package rukmini.tutorial.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = Integer.parseInt(args[0]);
		int ages [] = {23,45,67,78,100};
		System.out.println("Before ");
		int age;
			//	System.out.println(age);
		System.out.println("After ");
		try{
			age = ages[index];
		}catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			age = 1000;
		}
		System.out.println(age);
		if(age==1000) {
			System.out.println("Not sure ");
		}else if(age >30) {
			System.out.println("Age is more than 30 ");
		}else if(age <1){
			System.out.println("Iam kid ");
		}

	}

}
