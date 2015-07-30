package rukmini.tutorial.io.serialization;

import java.io.Serializable;

public class Person implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3583294477890096632L;
	private String name;
	private String place;
	private  String profession;
	private transient int  ssn;
	
	private String role;
	private String gender;
	
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

public Person(String name,String place,String profession){
		
		this.name  = name;
		this.place = place;
		this.profession = profession;
		
		
	}
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
