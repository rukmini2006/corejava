package basics;

public class ReverseStringexample {

	public static void main(String[] args) {
		String name = "Rukmini";
		int k = name.length();
		String reverseString = "";
		for (int i = k - 1; i >= 0; i--) {
			reverseString = reverseString + name.charAt(i);
		}
		System.out.println(reverseString);
	}
}
