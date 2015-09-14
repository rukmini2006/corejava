package com.tutorial.spring.core_01.advancedContainer._04PropertiesFile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/tutorial/spring/core_01/advancedContainer/_04PropertiesFile/applicationContext.xml");
	DemoBean db = (DemoBean) context.getBean("demo");
	System.out.println(db.hi());
}
}
