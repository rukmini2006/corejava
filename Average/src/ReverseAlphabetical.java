import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ReverseAlphabetical {
	
	String reverse(String str){
		String rStr=new StringBuffer(str).reverse().toString();
		return rStr;
	}
	
	
	String alphaOrder(String str){
		char[] charArray=str.toCharArray();
		Arrays.sort(charArray);
		String aString=new String(charArray);
		return aString;
		
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Ener a string");
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String inputString=bf.readLine();
		System.out.println("String before reversing "+inputString);
		ReverseAlphabetical obj=new  ReverseAlphabetical();
String reverseString=obj.reverse(inputString);
String alphaString=obj.alphaOrder(inputString);
System.out.println("string after reverse "+reverseString);
System.out.println("string in alphabetical order : "+alphaString);
	}

}
