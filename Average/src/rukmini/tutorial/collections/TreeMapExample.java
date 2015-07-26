package rukmini.tutorial.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> tr = new TreeMap<Integer,String>();
		tr.put(100,"aaa");
		tr.put(99,"ssss");
		
		for(Map.Entry m:tr.entrySet()){
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}

}
