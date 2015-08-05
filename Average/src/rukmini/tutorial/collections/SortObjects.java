package rukmini.tutorial.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortObjects {
	

private static final List list =getPersons();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//sortCollection();
		//sortingUsingAnnonymousInnerClassses();
		sortUsingLambdaExpression();

	}
	public static void sortCollection(){
		/*	List list = new ArrayList<>();
		list.add("banana");
		list.add("apple");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("After sorting"+list);
		//Collections.synchronizedList(list);
		//System.out.println(list);
		*/
		System.out.println(list);
		/*Collections.sort(list);
		System.out.println(list);*/
	/*Collections.sort(list, new ProfessionSort());
	System.out.println(list);*/
		Collections.sort(list,new PlaceSort());
		System.out.println(list);
	}
	public static List getPersons(){
		
		List<Person> list =new ArrayList<>();
		list.add(new Person("A" ,"Army", "Andaman"));
		list.add(new Person("C" ,"Worker", "Camaron"));
		list.add(new Person("B" ,"Cook", "Mass"));
		list.add(new Person("D" ,"Army", "Bombay"));
		return list;
		
	}
	//@SuppressWarnings("unchecked")
	public static void sortingUsingAnnonymousInnerClassses() {
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.profession.compareTo(o2.profession);
			}
		}
		
						);
		System.out.println(list);
	

}
	public static void sortUsingLambdaExpression() {
		Collections.sort(list, (Object o1, Object o2)->((Person)o1).profession.compareTo(((Person)o2).profession));
		System.out.println(list);
		
		Collections.sort(list, ( o1,  o2)->((Person)o1).place.compareTo(((Person)o2).place));
		System.out.println(list);
	}
}

