package com.tutorial.spring.core_01.coreContainer._10ConstructorInjectionBeanTypes;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource res = new ClassPathResource("com/tutorial/spring/core_01/coreContainer/_10ConstructorInjectionBeanTypes/spring.cfg.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		DemoInterImpl impl = (DemoInterImpl) factory.getBean("db");
		System.out.println(impl.sayHello());
	}

}
