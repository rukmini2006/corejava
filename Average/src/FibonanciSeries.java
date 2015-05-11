import java.util.Scanner;
public class FibonanciSeries {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number till where u want to print the series");
		int number=in.nextInt();
		int num1=0;
		int num2=1;
		System.out.println("Printing Fibonanci series upto "+number);
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<=number;i++){
			int num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
			
		}
	

	}

}
