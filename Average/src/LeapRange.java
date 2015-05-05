import java.util.Scanner;


public class LeapRange {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
       System.out.println("Enter the first year ");
       int year1=in.nextInt();
       System.out.println("enter the next year to find leap ");
       int  year2=in.nextInt();
       for(int leap=year1;leap<year2;leap++){
    	   if(leap%4==0){
    		   System.out.println(+leap +" is a lepa year");
    	   }else{
    		   System.out.println(+leap +" is not a lepa year");
    	   }
       }
	}

}
