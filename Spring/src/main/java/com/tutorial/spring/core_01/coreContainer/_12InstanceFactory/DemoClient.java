package com.tutorial.spring.core_01.coreContainer._12InstanceFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource res = new ClassPathResource(
				"com/tutorial/spring/core_01/coreContainer/_12InstanceFactory/applicationContext.xml");

		XmlBeanFactory factory = new XmlBeanFactory(res);

		 DemoInter d1 =  (DemoInter) factory.getBean("db");
		 System.out.println(d1.sayHello());
	}

}
