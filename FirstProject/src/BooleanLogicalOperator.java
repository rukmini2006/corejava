
public class BooleanLogicalOperator {

	public static void main(String[] args) {
		int urAge =16;
		int myAge = 43;
		
//	 TERNARY OPERATOR EXAMPLE	
//		int urAge = Integer.parseInt(args[0]);
//		String message=(urAge>56)?"we are adults":"we are not adults";
//		System.out.println(message);

//		int urAge = Integer.parseInt(args[0]);
//		int myAge = Integer.parseInt(args[1]);
		
		boolean checkCondition=(urAge++ > 13) ||  (myAge++ >50);
		
		System.out.println(" urAge "+urAge );
		System.out.println(" myAge "+myAge );
		
		
		System.out.println(checkCondition);
		
	}

}
