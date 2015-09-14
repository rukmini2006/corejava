package com.tutorial.spring.core_01.advancedContainer._01FirstApplicationContext;

public class DemoImpl  implements DemoInter{

	private String message;

	public DemoImpl() {
		System.out.println("Constructor executed");
	}

	public void setMessage(String s) {
		message = s;
		System.out.println("setter executed");
	}

	public String wish(String uname) {
		return message + " " + uname + " Have a great day";
	}
}
