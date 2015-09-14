package com.tutorial.spring.core_01.coreContainer._04PreDefinedBean;

import java.util.Date;

public class DemoInterImpl implements DemoInter {
	private String message;
	private Date dt;
	
	public DemoInterImpl() {
		System.out.println("DemoInterImpl zero argument constructor");
	}
	

	public void setMessage(String message) {
		this.message = message;
	}


	public void setDt(Date dt) {
		this.dt = dt;
	}


	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Message is : "+message);
		System.out.println("Date is : "+dt);
		
	}

}
