package rukmini.tutorial.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      hashMap();
     /* List  listJ  = new ArrayList();
      listJ.add("Jone");
      listJ.add("Jtwo");
      
      List listC= new ArrayList();
      listC.add("Cone");
      listC.add("Ctwo");
      
      List listAll = new ArrayList();
      listAll.add(listJ);
      listAll.add(listC);*/
      
      
	}
	public static void hashMap(){
		
		Person  per1= new Person("rukmini","1234","california");
		Person per2 = new Person("prakash","3456","chicago");
		List<Person> personList = new ArrayList<Person>();
		personList.add(per1);
		personList.add(per2);
		
		List<Fruit> fruitList = new ArrayList<Fruit>();
		Fruit apple = new Fruit("Apple","10");
		Fruit banana = new Fruit("Banana","20");
		
		fruitList.add(apple);
		fruitList.add(banana);
		
		Map objectMap = new HashMap();
		objectMap.put("person", personList);
		objectMap.put("fruit", fruitList);
		
		System.out.println(objectMap.get("person"));
		System.out.println(objectMap.get("fruit"));
		
		objectMap.put(10, "ten");
		objectMap.put(20,"twenty");
		objectMap.put(null, null);
		
		Iterator itr  = objectMap.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry mapentry =(Map.Entry) itr.next();
			
			System.out.println(mapentry.getKey() +" " +mapentry.getValue());
			
		}
		
		
		//for(Map.Entry mapentry:objectMap.entrySet()){
		
		
		
		
	}

}
