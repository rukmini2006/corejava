package basics;

public class AssignmentOnJumpStatement {

	public static void main(String[] args) {

		//If we use break for nested for loop if we put 
		//break inside inner loop then it breaks from 
		//innermost loop
		
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(i==j)
					break;
			}
			System.out.println("Hello ");
		}
		
		//Breaking the outerloop with label
		
		
//		outerloop:
//		for(int i=0;i<5;i++){
//			for(int j=0;j<5;j++){
//				if(i*j>6){
//					System.out.println("Breaking ");
//					break outerloop;
//				}
//				System.out.println(i+" "+j);
//			}
//			System.out.println("Done");
//			
//		}
//	}

}
}
