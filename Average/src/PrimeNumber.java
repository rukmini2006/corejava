
public class PrimeNumber {

	public static void main(String[] args) {
		int num=19;
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
			if(count==2){
				System.out.println(" entered number is prime number");
			}else{
				System.out.println(" entered number is not prime number");
			}
		

	}

}
