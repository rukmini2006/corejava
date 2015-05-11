
public class FibRecursion {
	static int  num1=0,num2=1,num3=0;
	

 static void printFibonanci(int number){
	 if(number>0){
	
	 num3=num1+num2;
	 num1=num2;
	 num2=num3;
	 System.out.print(" "+num3);
	 printFibonanci(number-1);
 }
 }
	public static void main(String[] args) {
		int number=5;
		System.out.print(num1+"  "+num2);
		printFibonanci(number-2);

	}

}
