package rukmini.tutorial.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {
		//arrayListExample();
		//iterateArrayList();
	//	vectorExample();
	//	methodReference();
		generics();
		
		

	}
	
	/*public static void arrayListExample() {
		
		List list = getNumbersFromDatabase();
		//System.out.println(list);
		list.add(2,"three");
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			String name =(String) itr.next();
			System.out.println(name);
			//itr.remove();
			
			//System.out.println(name);
			if("four".equals(name)){
				itr.remove();
			}
		
			
		}
		System.out.println(list);
		
		*/
		//String fruit[] = {"Apple","Apple","Orange"};
	//	System.out.println(fruit[2]);
	//	fruit[3] = "banana";
		//List al = new ArrayList();
		/*Set al = new HashSet();
		
		al.add("Apple");
		al.add("Apple");
		al.add("Orange");*/
	//	al.add(7);
		
	//	System.out.println(al.get(2));
	//al.add("banana");
		//System.out.println(al.get(4));
	//	System.out.println(al);
	/*	for(int i = 0;i <al.size(); i++){
			System.out.println(al.get(i));
		}
	*/
		
		
	//}


/*public static List getNumbersFromDatabase(){
	List list = new LinkedList();
	list.add("one");
	list.add("two");
	list.add("four");
	list.add("five");
	list.add("six");
	return list;
	
}*/
/*public static void iterateArrayList(){
	List list = new LinkedList();
	list.add("one");
	list.add("two");
	list.add("three");
	System.out.println(" Before ====" +list);
	Iterator itr = list.iterator();
	while(itr.hasNext()){
		String value = (String) itr.next();
		System.out.println(value +" ");
		if(value =="two")
			itr.remove();
	}
	
	System.out.println("After  ===== "+list);
}*/

/*public static void vectorExample(){
	
	Vector vec = new Vector();
	vec.add("one");
	Iterator itr = vec.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
}
public static void methodReference(){
	
	List numbers = new ArrayList();
	numbers.add("one");
	numbers.add("two");
	numbers.add("three");
	
	Collections.synchronizedList(numbers);
	
	numbers.forEach(System.out::print);
	
	
}*/

public static void generics(){
	List<String> numbers = new ArrayList<String>();
	numbers.add("one");
	numbers.add("two");
	numbers.add("three");
	List<Person>  persons = new ArrayList<Person>();
		Person per = new Person();
		persons.add(per);
		
		for(String num:numbers){
			System.out.println(num);
			
			for(Object O :persons){
				System.out.println(O);
			}
		}

	
	
}
}
