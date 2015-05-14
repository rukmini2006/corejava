
public class TestArray1 {
	
	
	static void max(int arr[]){
		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
				System.out.println("Maximum value in the given array is: "+max);
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		int a[] = {28,53,44};
		max(a);
		
		

	}

}
