package basics;

enum Months {
	JAN, FEB, MAR, APRIL
}

public class EnumExample {
	public static final String NAME = "rukmini";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumExample.printMonthNamesWithEnum(Months.MAR);
	}

	public static void printMonthNamesWithEnum(Months month) {
		if (month == Months.JAN) {
			System.out.println("January");
		} else if (month == Months.FEB) {
			System.out.println(" Febryary");
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
