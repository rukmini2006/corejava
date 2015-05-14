import java.util.Scanner;




public class ArraysInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		
		 int size = in.nextInt();
		int ages[] = new int[size];
		
		
		 
		 System.out.println(" Length of an array is: "+ages.length);
		 System.out.println("Displaying elements of an array ");
		for(int j=0;j<ages.length;j++){
				ages[j] = j+10;
			 System.out.println(ages[j]);
		 }
		

	}

}
