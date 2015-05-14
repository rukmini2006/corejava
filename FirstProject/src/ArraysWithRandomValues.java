import java.util.Random;


public class ArraysWithRandomValues {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int ages[] = new int[5];
		
				
		for(int i=0;i<ages.length;i++){
			
			ages[i] = r.nextInt(50);
			
		}
		for(int n:ages){
			System.out.println(n);
		}
		
		}
		
	
	}


