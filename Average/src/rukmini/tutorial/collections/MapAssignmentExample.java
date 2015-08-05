package rukmini.tutorial.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapAssignmentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	hashMap();
		hashtable();
		
	}
	
		public static void hashMap(){
			Jewwlery j1 =new Jewwlery("longchain","silver");
			Jewwlery j2 =new Jewwlery("shortchain","gold");
			List<Jewwlery> jewels =new ArrayList<>();
		
			jewels.add(j1);
			jewels.add(j2);
			List<Jewwlery> jewelsbar = new ArrayList<>();
		//	jewelsbar.add(j1);
			jewelsbar.add(j2);
			Map map = new HashMap<>();
			map.put("jew1", jewels);
			map.put("jew1",jewelsbar);
			
			map.put(null, null);
			Iterator itr = map.entrySet().iterator();
			while(itr.hasNext()){
				Map.Entry me = (Map.Entry) itr.next();
				System.out.println("key "+me.getKey()+" "+"value is"+me.getValue());
				
			}

		}
		public static void hashtable() {
			Jewwlery j1 =new Jewwlery("longchain","silver");
			Jewwlery j2 =new Jewwlery("shortchain","gold");
			List<Jewwlery> jewels =new ArrayList<>();
		//List allows duplicates
			jewels.add(j1);
			jewels.add(j1);
			jewels.add(j2);
			
			Cars cars =new Cars("Honda");
			Cars cars1 = new Cars("bmw");
			
			//set doesn't allow duplicates it contains only unique values
			Set set= new HashSet<>();
			set.add(cars);
			set.add(cars);
			set.add(cars1);
			
			List<Jewwlery> jewelsbar = new ArrayList<>();
		//	jewelsbar.add(j1);
			jewelsbar.add(j2);
			Map map = new Hashtable();
			map.put("jew1", jewels);
			map.put("sets",set);
		//	map.put("jew1",jewelsbar);
			
			//map.put(null, null);
			Iterator itr = map.entrySet().iterator();
			while(itr.hasNext()){
				Map.Entry me = (Map.Entry) itr.next();
				System.out.println("key "+me.getKey()+" "+"value is"+me.getValue());
				System.out.println(me.getValue());
			}
			
		}
		
		
	}


