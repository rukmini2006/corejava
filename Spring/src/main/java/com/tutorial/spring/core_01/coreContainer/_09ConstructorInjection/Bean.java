package com.tutorial.spring.core_01.coreContainer._09ConstructorInjection;

public class Bean {

	private int a;
	private float b;
	private String c;
	public Bean() {
		super();
	}
	public Bean(int a, float b, String c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public String toString() {
		return "Bean [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
