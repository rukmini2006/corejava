import java.util.Scanner;

public class RangeOFEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lower limit  ");
		int ll = scanner.nextInt();
		System.out.println("Enter the upper limit  ");
		int ul = scanner.nextInt();
		for (int i=ll; i <= ul; i++) {
			if (i % 2 == 0) {
				System.out.println(+i + " is an even number");
			} else {
				System.out.println(+i + " is not an even number ");
			}

		}

	}

}
