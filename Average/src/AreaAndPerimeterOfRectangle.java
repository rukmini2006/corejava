import java.util.Scanner;


public class AreaAndPerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		int length=in.nextInt();
		System.out.println(" Enter the width of rectangle");
		int width=in.nextInt();
		int area=length*width;
		int perimeter=2*(length+width);
		System.out.println("Area is :  "+area);
		System.out.println("Perimeter is : "+perimeter);

	}

}
