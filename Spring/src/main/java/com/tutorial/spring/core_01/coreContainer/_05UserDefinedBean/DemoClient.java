package com.tutorial.spring.core_01.coreContainer._05UserDefinedBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.propertyeditors.ClassArrayEditor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res = new ClassPathResource("com/tutorial/spring/core_01/coreContainer/_05UserDefinedBean/spring.cfg.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		DemoInterImpl inter = (DemoInterImpl) factory.getBean("demobean");
		inter.show();
		
	}

}
