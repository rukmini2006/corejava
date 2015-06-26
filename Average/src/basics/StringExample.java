package basics;

public class StringExample {

	public static void main(String[] args) {
		String name0 = new String("Rukmini");
		String name1 = new String("Rukmini");
		String name2 = new String("Rukmini");
		String name3 = new String("Rukminiw");
	
		//System.out.println(name0 == name1);
		System.out.println(name0.equals(name1));
		System.out.println(name2.equals(name3));
		
		String name5 = "rukmini";
		String name6 = "rukmini";
		String name7 = "rukmini";
		
		String name4 = "prakash";
		
		System.out.println(name5.equals(name6));
		
		String name = "rukmini";
		System.out.println(name.charAt(3));
		//System.out.println(name.compareTo(anotherString));
		System.out.println(name.concat("praka"));
		System.out.println(name.contains("s"));
		System.out.println(name.endsWith("i"));
		System.out.println(name.indexOf('r'));
		System.out.println(name.isEmpty());
		System.out.println(name.length());
		System.out.println(name.startsWith("t"));
		System.out.println(name.substring(3));
		System.out.println(name.toCharArray());
		System.out.println(name.toUpperCase());
		//System.out.println(name.);
		System.out.println(" Iam at last line");
		
		String  myFirstName = "rukmini";
		//myFirstName = myFirstName+" mortyha";
		myFirstName = myFirstName.concat(" mortha");
		System.out.println(myFirstName);

	}


}
