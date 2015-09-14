package com.tutorial.spring.core_01.coreContainer._09ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource res = new ClassPathResource("com/tutorial/spring/core_01/coreContainer/_09ConstructorInjection/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Bean bean = (Bean) factory.getBean("be");
		System.out.println(bean);
	}

}
