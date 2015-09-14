package com.tutorial.spring.core_01.coreContainer._01FirstApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoClient {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/tutorial/spring/core_01/coreContainer/_01FirstApp/spring.cfg.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		DemoInter demointer= (DemoInter) factory.getBean("demo");
		System.out.println(demointer.wish("rukmini"));
		
	}
	
	
		
}
