package com.tutorial.spring.core_01.coreContainer._08ConstructorInjection;

public class Demo {
	
	private String message;
	private int age;
	
	public Demo() {
		super();
	}
	
	public Demo(String message){
		System.out.println("One argumented constructor ");
	}
	
	
	public Demo(String message, int age) {
		this.message = message;
		this.age = age;
		System.out.println("Two argumented constructor with message and age ");
	}
	
	public Demo(int age,String message) {
		this.age = age;
		this.message = message;
		System.out.println("Two argumented with age and message ");
			
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message+ " "+age;
	}

}
