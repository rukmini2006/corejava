package com.tutorial.spring.core_01.advancedContainer._02Prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {

	public static void main(String args[])
	{

		/*	Resource  res=new ClassPathResource("applicationContext.xml");
		BeanFactory  factory=new XmlBeanFactory(res);*/

		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/tutorial/spring/core_01/advancedContainer/_02Prototype/applicationContext.xml");

		//DemoInter d1=(DemoInter)ctx.getBean("demoo");
		DemoImpl d1=(DemoImpl)ctx.getBean("demoo");
		DemoImpl d2=(DemoImpl)ctx.getBean("demoo");
		DemoImpl d3=(DemoImpl)ctx.getBean("demoo");
		//DemoInter d2=(DemoInter)ctx.getBean("demoo");

		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d3.wish("Sai"));

		d1 = d2 = d3 ;
		ctx.close();
	}
	
}
