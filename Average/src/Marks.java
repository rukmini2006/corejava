import java.util.Scanner;


public class Marks {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Numbers to calculate average");
		int num1=in.nextInt();
		int num2=in.nextInt();
		int num3=in.nextInt();
		int total=num1+num2+num3;
		double avg=total/3;
		System.out.println("Average is:"+avg);

	}

}
