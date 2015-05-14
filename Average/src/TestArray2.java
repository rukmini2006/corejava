
public class TestArray2 {
	
	// Minimum number in an array
	
	static void min(int arr[]){
		int min = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
				System.out.println("Minimum value in array is:  "  +min);
			}
			
		}
		
		
		
		
	}

	public static void main(String[] args) {
		int a[] = {5,2,43,56};
		min(a);
	
		
	}

}
