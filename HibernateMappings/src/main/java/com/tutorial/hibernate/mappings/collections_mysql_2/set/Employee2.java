package com.tutorial.hibernate.mappings.collections_mysql_2.set;

import java.util.List;
import java.util.Set;

public class Employee2 {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private Set certificates;
	
//	private List certificates; // For List Only
//	private Collection certificates; // For Bag only
//	private Map certificates; // Only For Map
	
	
	public Employee2() {
		super();
	}

	public Employee2( String firstName, String lastName, int salary) {
		super();
		//this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set getCertificates() {
		return certificates;
	}

	public void setCertificates(Set cert) {
		this.certificates = cert;
	}
	
	
	
}
