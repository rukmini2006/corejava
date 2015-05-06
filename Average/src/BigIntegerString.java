import java.math.BigInteger;


public class BigIntegerString {

	public static void main(String[] args) {
		BigInteger biginteger1=new BigInteger("12345");
		BigInteger biginteger2=new BigInteger("83383");
		String result=biginteger1.multiply(biginteger2).toString();
		System.out.println("Result (in string) is ====>" +result);
				

	}

}
