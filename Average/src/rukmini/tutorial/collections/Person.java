package rukmini.tutorial.collections;

public class Person implements Comparable {
	
public String name;
String profession;
public String place;



public Person(String name,String profession,String place){
	
	this.name = name;
	this.profession = profession;
	this.place = place;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String getprofession() {
	return profession;
}
public void setprofession(String profession) {
	this.profession = profession;
}

public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}

@Override
public String toString() {
	return  name + " " + profession + " "+ place ;
}

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

//@Override
//public int compareTo(Object d) {
	// TODO Auto-generated method stub
//	return this.name.compareTo(((Person)d).getName());
	//return this.profession.compareTo(((Person)d).getprofession());
	//return this.place.compareTo(((Person)d).getPlace());
//}

}
