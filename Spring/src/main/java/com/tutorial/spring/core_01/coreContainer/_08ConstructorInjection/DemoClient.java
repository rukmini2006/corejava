package com.tutorial.spring.core_01.coreContainer._08ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res = new ClassPathResource("com/tutorial/spring/core_01/coreContainer/_08ConstructorInjection/applicationContext.xml");
		BeanFactory factory = new  XmlBeanFactory(res);
		Demo demo1=(Demo) factory.getBean("demo");
		System.out.println(demo1);
		
	}

}
