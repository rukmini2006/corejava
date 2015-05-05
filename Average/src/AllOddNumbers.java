import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AllOddNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number ");
int num=Integer.parseInt(br.readLine());
System.out.println("odd numbers are as ");
for(int i=1;i<num;i++){
if(i%2==1){
	System.out.println(+i);
}
	}

}
}
