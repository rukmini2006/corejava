package rukmini.tutorial.collections.sortObjects;

public class Person implements Comparable {
	String name;
	String place;
	String profession;
	
	public Person(String n,String p,String pr){
		
		name= n;
		place = p;
		profession = pr;
			
	}
	
	
	
	public String toString(){
		return name+" "+ place + " " +profession;
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPlace() {
		return place;
	}



	public void setPlace(String place) {
		this.place = place;
	}



	public String getProfession() {
		return profession;
	}



	public void setProfession(String profession) {
		this.profession = profession;
	}



	@Override
	public int compareTo(Object o) {
		return 
		return 0;
	}

}
