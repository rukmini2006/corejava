
public class MultiDimensionalArray {

	public static void main(String[] args) {
		
//		int person1[] = {5,30};
//		int person2[] = {6,35};
//		int person3[] = {7,43};
//		
		//int persons[][] = {person1,person2,{7,43}};
		
		
		
//		System.out.println(person1[0] + "  "+ person1[1]);
//		System.out.println(persons[1][1]);
//		
		int persons[][] = {{5,30},{6,35}, {7,43}};
		
		for(int row=0;row<persons.length;row++){
			for(int col=0;col<persons[row].length;col++){
				System.out.print(persons[row][col] + "\t ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
