import java.util.Scanner;
public class AreaAndPerimeterOfTriangle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the base ");
		int base=in.nextInt();
		System.out.println("enter the height ");
		int height=in.nextInt();
		int area=(base*height)/2;
		System.out.println(" Area of triangle is: "+area);
		int a,b,c,perimeter;
		System.out.println("enter the values of a,b,c ");
		 a=in.nextInt();
		 b=in.nextInt();
		 c=in.nextInt();
		 perimeter=a+b+c;
		 System.out.println(" Perimeter of a triangle is "+perimeter);
		
		

	}

}
