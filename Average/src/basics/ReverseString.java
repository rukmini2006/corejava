package basics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// String name = "Rukmini";
		/*
		 * for(int i = 0; i <name.length(); i++){
		 * System.out.println(name.charAt(i)); }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed ");
		String word = sc.next();
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
			System.out.println(reverse);

		}

	}

}
