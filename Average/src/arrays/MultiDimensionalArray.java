package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int persons[][] = { { 5, 30 }, { 6, 35 }, { 7, 43 } };

		System.out.println("Printing elements of an person array as: ");
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				System.out.print(persons[i][j] + " \t ");
			}
			System.out.println();
		}
		System.out.println("\n ");
		System.out.println("Using Enhanced For Loop================ ");
		
		for(int [] i : persons){
			for(int s : i){
			System.out.print(s + "\t");
			}
			System.out.println();
		}

	}

}
