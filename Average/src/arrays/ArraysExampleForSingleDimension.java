package arrays;

public class ArraysExampleForSingleDimension {

	public static void main(String[] args) {
		// int age1 = 30;
		// int age2 = 40;
		// int age3 = 60;

		// int ages[] = {30,40,50};

		int ages[] = { 30, 40, 50, 55 };

		System.out.println("Using normal for loop=============== ");
		for (int i = 0; i < ages.length; i++)
			System.out.println("elements of ages array :  " + ages[i]);

		System.out.println("Using Enhanced for loop=============== ");
		for (int a : ages) {
			System.out.println(a);

			String names[] = { "one", "two", "three" };

			System.out.println("Normal for loop ");
			for (int i = 0; i < names.length; i++)
				System.out.println("elements are : " + names[i]);
			System.out.println("\n============== ");

			System.out.println("Enhanced for loop ");
			for (String str : names)
				System.out.println("elements are : " + str);

		}

	}

}
