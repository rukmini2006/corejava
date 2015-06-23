

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to determine whether it is an  even number ");
		int num = scanner.nextInt();
//		for(int  i = 0;i<=num;i++){
			if(num%2==0){
				System.out.println(+num+" is an even number ");
			}else
				System.out.println(+num+" is not an even number ");
		}
		
	}


