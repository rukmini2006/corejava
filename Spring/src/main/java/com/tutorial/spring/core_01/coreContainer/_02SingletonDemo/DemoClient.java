package com.tutorial.spring.core_01.coreContainer._02SingletonDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("com/tutorial/spring/core_01/coreContainer/_02SingletonDemo/Demo.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		DemoInterImpl impel = (DemoInterImpl) factory.getBean("demo");
		System.out.println(impel.wish("rukmini"));
	}

}
