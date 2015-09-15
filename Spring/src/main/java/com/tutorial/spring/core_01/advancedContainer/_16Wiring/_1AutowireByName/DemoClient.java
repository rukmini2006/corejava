package com.tutorial.spring.core_01.advancedContainer._16Wiring._1AutowireByName;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/spring/core_01/advancedContainer/_16Wiring/_1AutowireByName/applicationContext.xml");
		DemoBean db=(DemoBean) context.getBean("demo");
		System.out.println(db.hi());
	}

}
