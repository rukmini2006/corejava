package com.tutorial.spring.core_01.coreContainer._01FirstApp;

public class DemoInterImpl implements DemoInter {
	
	private String message;
	

	public DemoInterImpl() {
		System.out.println("Constructor executed ");
	}

	
	public void setMessage(String message) {
		System.out.println("setter method executed ");
		this.message = message;
	}


	public String wish(String uname) {
		// TODO Auto-generated method stub
		return message + " " +uname+ "Hello How r u";
	}

}
