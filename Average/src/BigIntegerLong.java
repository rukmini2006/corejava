import java.math.BigInteger;


public class BigIntegerLong {

	public static void main(String[] args) {
		BigInteger biginteger1=new BigInteger("1234");
		BigInteger biginteger2=new BigInteger("3456");
		
		long result=biginteger1.multiply(biginteger2).longValue();
		System.out.println("long value =====>"+result);
		

	}

}
