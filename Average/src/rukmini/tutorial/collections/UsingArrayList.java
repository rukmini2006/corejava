package rukmini.tutorial.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UsingArrayList {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
	//	System.out.println(list.size());
	//	System.out.println(list.get(3));
		ListIterator<String> itr =list.listIterator(list.size());
		
		/*while(itr.hasNext()){
		//in forward direction	
			System.out.println(itr.next());
		}
		*/
		List newList = new ArrayList();
		
		while(itr.hasPrevious()){
			//in reverse direction
			newList.add(itr.previous());
			
		}
		System.out.println(newList);
		
		
	/*	List listNew = new ArrayList();
		
	//	System.out.println(listNew.size());
		Collections.reverse(list);
		
		listNew.addAll(list);
		
	//	System.out.println(listNew.size());
		
		
		Iterator itr = listNew.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			}*/
		
		
		
	/*	newList.addAll(list);
		
		System.out.println(newList);*/
		
		}

}
