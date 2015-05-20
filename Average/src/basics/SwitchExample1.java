package basics;

public class SwitchExample1 {

	public static void main(String[] args) {
		int age = 21;
		String name = (age > 18) ? "Adult" : "Child";
		// System.out.println(name);
		System.out.println("====using if else==== ");
		if (age < 18) {
			name = "18";
		} else if (age > 19 && age < 22) {
			name = "19";
		} else if (age > 21) {
			name = "21";
		} else {
			name = "no name";
		}
		System.out.println(name);

		System.out.println("=====USing nested if======== ");
		if (age == 18) {
			name = "18";
		}
		if (age == 19) {
			name = "19";
		}
		if (age == 21) {
			name = "21";
		} else {
			name = "no name";
		}
		System.out.println(name);
	}

}
