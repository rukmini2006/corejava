package com.tutorial.spring.core_01.coreContainer._11StaticFactory;

public class TestBean {
	  String msg;

	public TestBean() {
		super();
	}

	public TestBean(String msg) {
		super();
		this.msg = msg;
		System.out.println("Private constructor invoked ");
	}
	//static factory method
	public static TestBean getTestBean(String msg) {
		System.out.println("static factory method invoked ");
		return new TestBean(msg);
			
	}
	@Override
	public String toString() {
		return msg;
	}
}
