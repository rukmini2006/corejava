
public class BitLogicExample {

	public static void main(String[] args) {
	int a=7;
	int b=9;
	int c=a|b;
	System.out.println(c);
	int d=a&b;
	System.out.println(d);
	int e=a^b;
	System.out.println(e);
	int f = (~a & b)  |  (a & ~b);
	System.out.println(f);
	int g = ~a & 0x0f;
	System.out.println(g);
    if((a == 7) || (b==6))
    	System.out.println("value of a is 7 or value of b is 7");
    if((a==7) &&(b==9))
    	System.out.println("value of  a  AND  b  are  7 and 9 respectively");
    
    if(a ==b)
    	System.out.println("a ==b");
    if(a != b)
    	System.out.println("a != b");
    if(a > b)
    	System.out.println("a > b");
    if (a < b)
    	System.out.println("a < b");
    if(a >= b)
    	System.out.println("a >= b");
    if(a <= b)
    	System.out.println("a <= b");
    
    int result;
    boolean isEqual=(a <= b);
    result = isEqual ? a : b;
    System.out.println(result);
    
    System.out.println(a >> 2);
    
    System.out.println(a << 2);
    
    System.out.println(b >> 2);
    
    System.out.println(b >> 4);
    
    System.out.println(b  << 6);
    
    System.out.println(a >>> 2);
    
    
    
    }
	
	

	}


