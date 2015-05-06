
public class SwappingOfTwoNumbersFromKeyBoard {

	public static void main(String[] args) {
		int num1=Integer.parseInt("123");
		int num2=Integer.parseInt("546");
		System.out.println("Numbers before swapping are as follows: "+num1+" and "+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Numbers after  swapping are as follows: "+num1+" and "+num2);
		

	}

}
