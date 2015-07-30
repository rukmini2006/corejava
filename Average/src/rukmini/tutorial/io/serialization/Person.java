package rukmini.tutorial.io.serialization;

import java.io.Serializable;

public class Person implements Serializable {
	
	private String name;
	private String place;
	private String profession;
	int ssn;
	
	public Person(String name,String place,String profession,int ssn){
		
		this.name  = name;
		this.place = place;
		this.profession = profession;
		this.ssn = ssn;
		
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

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	

}
