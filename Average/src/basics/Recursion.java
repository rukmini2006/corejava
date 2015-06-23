package basics;

//Non static reference calls static methods
//Static reference cannot call non static 

class Factorial{
	int factorial(int n){
		int val = 0;
		int result;
		if(n==1)
		return 1;
		
		result = factorial(n-1) *n;
		return result;
		
	}
	
}

public class Recursion {
public static void main(String[] args) {
	
	Factorial f = new Factorial();
	//System.out.println("Factorial of 4 is: "+f.factorial(7));
	System.out.println(Recursion.callMe());
	/*int fact = 1;
	for(int i =1;i<=5;i++){
		fact = fact*i;
		
	}
	System.out.println("Factorial of the given number is :  "+fact);*/
}
public static  String callMe(){
	return "rukmini" ;

	
}
public void printMe(){
	
	callMe();
	
}
}
