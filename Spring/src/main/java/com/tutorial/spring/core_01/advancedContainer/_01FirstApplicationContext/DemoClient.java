package com.tutorial.spring.core_01.advancedContainer._01FirstApplicationContext;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/spring/core_01/advancedContainer/_01FirstApplicationContext/spring.cfg.xml");
		DemoInter d1 = (DemoInter) context.getBean("demo");
		DemoImpl d2=(DemoImpl) context.getBean("demo");
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		context.close();
	}

}
