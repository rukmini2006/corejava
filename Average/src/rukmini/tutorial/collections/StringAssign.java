package rukmini.tutorial.collections;

public class StringAssign {

	public static void main(String[] args) {
		
		String array[] = new String[4];
		
		array[0] = "one";
		array[1] = "two";
		array[2] = "three";
		array[3] = "four";
		
		String arrayNew[] = new String[4];
		
		int i = 0,j;
		for(j = array.length-1;j >=0;j--,i++){
		
			arrayNew[i ] = array[j];
					}
		//for(String s: arrayNew)
		for(int k=0;k<arrayNew.length;k++){
			System.out.println(arrayNew[k]);
		}
		
		

		
	}

}
