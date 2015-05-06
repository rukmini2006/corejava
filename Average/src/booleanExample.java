import java.util.Scanner;


public class booleanExample {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=in.nextInt();
		System.out.println("Enter the value of b");
		b=in.nextInt();
		System.out.println(a+ "  is greater than  "+b+" :"  +(a>b));
		System.out.println(a + "  is less than  " +b+ " :" +(a<b));
		System.out.println(a + "  is equal to  " +b+ " : "+(a==b));
		System.out.println(a  + "  is greater or equal to " +b+ " :" +(a>=b));
		System.out.println(a  + "  is less than or equal to " +b+ " :" +(a<=b));
		System.out.println(a  + "  is not equal to " +b+ " :" +(a!=b));
		System.out.println(a  + "  is equal to " +b+ " :" +(a==b));
		

	}

}
