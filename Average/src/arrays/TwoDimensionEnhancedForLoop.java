package arrays;

public class TwoDimensionEnhancedForLoop {

	public static void main(String[] args) {

	//	int persons[][] = { {5,30},
		//		                        {6,40},
		//		                        {7,90} };
		
		//Using Enhanced for loop
		
		// for(int [] i : persons){
		// for(int s : i){
		// System.out.print(s + "\t");
		// }
		// System.out.println();
		// }
		
		
		String[][] names  = { {"asha","Basha"},
				               {"balu","sarita"} 
															};
		
		for(String[] name : names){
			for(String person : name){
				System.out.print(person  + " \t ");
				}
			System.out.println();
		}
		
		
		}


	}


