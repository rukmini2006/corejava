
public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		
	a = PassByValue.cube(a);
		
	   System.out.println("value of a after function "+a);
		
	}
	public static int cube(int b) {
		 b=b+1;
		System.out.println(b*b*b);
		return b;
		
	}

	
}
