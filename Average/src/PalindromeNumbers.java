import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PalindromeNumbers {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number to check whether it is palindrome or not");
		try {
			int num=Integer.parseInt(br.readLine());
			int temp=num;
			int reverse=0;
			while(num>0){
				int remainder=num%10;
				num=num/10;
				reverse=reverse*10+remainder;
			}
			System.out.println(" after reversing number is: "+reverse);
			if(reverse==temp){
				System.out.println(" Number is palindrome number");
			}else
			{
				System.out.println(" Number is not palindrome");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
