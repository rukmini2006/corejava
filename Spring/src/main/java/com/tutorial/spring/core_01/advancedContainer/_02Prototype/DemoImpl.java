package com.tutorial.spring.core_01.advancedContainer._02Prototype;

public class DemoImpl {

	private String  message;

	public DemoImpl() {
		System.out.println("Object created..............");
	}
	public void setMessage(String s) {
		message=s;
		System.out.println("setter method executed");
	}

	public String wish(String uname) {
		return   message+" "+uname+" Have a great day";
	}
}
