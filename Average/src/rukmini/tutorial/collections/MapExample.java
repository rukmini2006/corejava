package rukmini.tutorial.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map  = new HashMap<Integer,String>();
		
		LinkedHashMap<Integer,String> map1 = new LinkedHashMap<Integer,String>();
		map1.put(200, "ashley");
		map1.put(200, "ashley");
		map1.put(201, "ashley");
		
		for(Map.Entry m : map1.entrySet()){
			System.out.println(m.getKey() + " " +m.getValue());
		}
		
		map.put(100,"amit");
		map.put(101, "rahul");
		map.put(103, "balu");
		map.put(103, "baluf");
		
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
