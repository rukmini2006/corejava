package com.tutorial.spring.core_01.coreContainer._01FirstApp;

public class DemoClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoInterImpl inter = new DemoInterImpl();
		inter.setMessage("Hello");
		System.out.println(inter.wish("rukmini"));
	}

}
