import java.util.Scanner;


public class TrianglePattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println(" Enter the number");
		int num=in.nextInt();
		for(int i=1;i<num;i++){
			for(int j=1;j<=i;j++){
			System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
