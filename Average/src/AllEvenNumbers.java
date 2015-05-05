import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AllEvenNumbers {

	public static void main(String[] args) {
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter the number: ");
	    try {
			int  num=Integer.parseInt(br.readLine());
			System.out.println("Even Numbers:  ");
			for(int i=1;i<num;i++){
				if(i%2==0){
					System.out.println(+i);
				}
			}
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
