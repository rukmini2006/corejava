package com.tutorial.spring.core_01.advancedContainer._00singleton;

public class SingletonClass {

	private static SingletonClass t = null;
	static {
		t = new SingletonClass();
	}

	// private constructor
	// so no one will create an object from outside the class
	private SingletonClass() {
		System.out.println("Private constructor of class gets invoked ");
	}

	// static factory method
	public static synchronized SingletonClass getInstance() {
		// singleton logic
		if (t == null) {
			t = new SingletonClass();
		}
		return t;
	}
	
	protected Object clone() // throws CloneNotSupportedException {
	{
		return t;// return new CloneNotSupportedException ("Its singleton class");
		
	}
}
