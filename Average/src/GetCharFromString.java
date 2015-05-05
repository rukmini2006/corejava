
public class GetCharFromString {
	public void convertStringToChar(){
		String str="AUSTRALIA";
		char[] ch=str.toCharArray();
		for(char c :ch)
			System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GetCharFromString().convertStringToChar(); 
	}

}
