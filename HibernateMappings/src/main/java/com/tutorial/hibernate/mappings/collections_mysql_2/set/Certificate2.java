package com.tutorial.hibernate.mappings.collections_mysql_2.set;

public class Certificate2 {
	
	private int id;
	private String name;
	public Certificate2() {
		super();
	}
	public Certificate2(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Required in case of set
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false; 
		if (!this.getClass().equals(obj.getClass())) 
			return false; 
		Certificate2 obj2 = (Certificate2)obj; 
		if((this.id == obj2.getId()) && (this.name.equals(obj2.getName()))) { 
			return true; 
		} 
		return false;
	}
	
	@Override
	public int hashCode() {
		int tmp = 0; 
		tmp = ( id + name ).hashCode();
		return tmp; 
	}
}
