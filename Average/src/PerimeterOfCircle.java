import java.util.Scanner;


public class PerimeterOfCircle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println(" enter the radius of circle");
		double radius=in.nextDouble();
		double perimeter=2*Math.PI*radius;
		System.out.println("area is:  "+perimeter);

	}

}
