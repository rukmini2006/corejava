package helloworlddir;

import java.util.Scanner;

public class MultiplicationTableFor5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for which multiplication table has to be displayed");
		int number=sc.nextInt();
		System.out.println("Printing the multiplication values for the number " +number);
		int fact=1;
		for(int i=0;i<=12;i++){
			fact=number*i;
			System.out.println(+number +" * " + i  +"=" +fact);
			}
		
		

	}

}
