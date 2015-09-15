package com.tutorial.spring.core_01.advancedContainer._15DiffConstructors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public Client() {
	
}
public static void main(String[] args) {
	ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/tutorial/spring/core_01/advancedContainer/_15DiffConstructors/applicationContext.xml");
	Bean b1 =(Bean) ctx.getBean("one");
	Bean b2 =(Bean) ctx.getBean("two");
	System.out.println(b1);
	System.out.println(b2);
}
}
