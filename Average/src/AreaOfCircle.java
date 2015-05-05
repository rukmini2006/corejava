import java.util.Scanner;


public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println(" enter the radius of circle");
double radius=in.nextDouble();
double area=Math.PI*radius*radius;
System.out.println("area is:  "+area);
	}

}
