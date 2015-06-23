package basics;

enum Months {
	JAN(1), FEB(2), MAR(3), APRIL(4);


	
	public int value;
	 Months(int value){
		this.value = value;
	}
	 
	 public int getValue(){
		 return this.value;
	 }
}

public class EnumExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumExample.printMonthNamesWithEnum(Months.JAN);
	}

	public static void printMonthNamesWithEnum(Months month) {
		if (month == Months.JAN) {
			System.out.println("January. so my lucky number is :"+(78+month.getValue()));
		} else if (month == Months.FEB) {
			System.out.println(" Febryary"+(45+month.getValue()));
		}

	}

	public static void printMonthNamesWithIndex(int index) {
		if (index == 1) {
			System.out.println("January. so my lucky number is : "
					+ (78 + index));
		} else if (index == 2) {
			System.out.println(" February.  so my lucky number is : "
					+ (89 + index));
		}

	}
}
