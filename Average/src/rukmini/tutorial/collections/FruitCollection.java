package rukmini.tutorial.collections;

import java.util.ArrayList;
import java.util.List;

public class FruitCollection {
	List<String> fruitlist = new ArrayList<String>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addPerson();
		
	}
	
	public static void addPerson(){
		Person  per1= new Person("rukmini","1234","california");
		Person per2 = new Person("prakash","3456","chicago");
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(per1);
		personList.add(per2);
		
		for(int i = 0; i<personList.size(); i++){
			Person obj = (personList.get(i));
			System.out.println(obj.getName());
			System.out.println(obj.getSsn());
			System.out.println(obj.getPlace());
			
		}
		
		
		
	}

}
