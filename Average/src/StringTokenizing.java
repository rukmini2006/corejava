import java.util.StringTokenizer;


public class StringTokenizing {

	public static void main(String[] args) {
		StringTokenizer stringtokenizer=new StringTokenizer("you are mine");
		System.out.println("the total number of tokens generated are: "+stringtokenizer.countTokens());
		while(stringtokenizer.hasMoreTokens()){
			System.out.println(stringtokenizer.nextToken());
		}

	}

}
