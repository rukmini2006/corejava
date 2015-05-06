import java.math.BigInteger;


public class BigIntegerExample {

	public static void main(String[] args) {
		BigInteger bi1=new BigInteger("12345");
		BigInteger bi2=new BigInteger("123456");
//		BigInteger big=bi1.add(bi2);
//		System.out.println(big);
//		BigInteger res=bi1.abs();
//		System.out.println(res);
		BigInteger res1=bi1.divide(bi2);
    	System.out.println(res1);
	}

}
