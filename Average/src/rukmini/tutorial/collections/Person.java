package rukmini.tutorial.collections;

public class Person {
	
String name;
String ssn;
String place;



public Person(String name,String ssn,String place){
	
	this.name = name;
	this.ssn = ssn;
	this.place = place;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String getSsn() {
	return ssn;
}
public void setSsn(String ssn) {
	this.ssn = ssn;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}


}
