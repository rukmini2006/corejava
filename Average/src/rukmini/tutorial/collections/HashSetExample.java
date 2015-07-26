package rukmini.tutorial.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListToTreeSet();

	}
	public static void arrayListToTreeSet(){
		ArrayList list =  new ArrayList();
		list.add("12121");
		list.add("Apple");
		list.add("apple");
		list.add("Orange");
		list.add("Banana");
		
		Set hashSet = new HashSet(list);
		
		Set treeSet = new TreeSet(list);
		
//		System.out.println(list);
		System.out.println(hashSet);
		System.out.println(treeSet);
		
}}

