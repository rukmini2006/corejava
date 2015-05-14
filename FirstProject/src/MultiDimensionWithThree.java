
public class MultiDimensionWithThree {

	public static void main(String[] args) {
		
		int persons[][]={{0,34,94},{33,45,99},{35,67,89}};
		
		System.out.println(persons.length);
		System.out.println("persons array is as follows ");
		for(int i=0;i<persons.length;i++){
			for(int j=0;j<persons[i].length;j++){
				
				System.out.print(persons[i][j] + "\t");
			}
			System.out.println();
		}


		
	}

}
