
public class Conversion {

	public static void main(String[] args) {
		boolean t=true;
		byte b=2;
		short s=100;
		char c='C';
		int i=200;
		long l=24000;
		float f=3.14f;
		double d=0.0000000000053;
		String g="ruknii";
		System.out.println("values of all variables like");
		System.out.println("t = " +t);
		System.out.println("b = " +b);
		System.out.println("s = " +s);
		System.out.println("c = " +c);
		System.out.println("i = " +i);
		System.out.println("l = " +l);
		System.out.println("f = " +f);
		System.out.println("d = " +d);
		System.out.println("g = " +g);
		
		//convet boolean to byte
		b=(byte) (t?1:0);
		System.out.println("value of b after conversion : "+b);
		
		//convert boolean to short
		s=(short) (t?1:0);
		System.out.println("value of s after conversion : "+s);
		
		//convert boolean to int
		i=t?1:0;
		System.out.println(i);
		
		//convert boolean to char
		
		c=(char) (t?1:0);
		System.out.println("value of s after conversion in unicode : "+c);
		
		c=(char) (t?'1':'0');
		System.out.println("value of s after conversion : "+c);
		
		//convert boolean to long
		
		l=(t?1:0);
		System.out.println(l);
		
		
		//convert booloean to float
		f=t?1:0;
		System.out.println(f);
		
		//convert booloean to double
		d=t?1:0;
		System.out.println(d);
		
		//convert boolean to string
		
		g=String.valueOf(t);
		System.out.println(g);
		g=(String)(t?"1":"0");
		System.out.println(g);
		
		int sum=(int) (b+i+d+f);
		System.out.println(sum);

	}

}
