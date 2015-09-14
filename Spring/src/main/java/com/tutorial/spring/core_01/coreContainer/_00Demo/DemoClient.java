package com.tutorial.spring.core_01.coreContainer._00Demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//@SuppressWarnings("deprecation")
public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("com/tutorial/spring/core_01/coreContainer/_00Demo/applicationContext.xml");
	//	@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(resource);
		Company comp = (Company) factory.getBean("company");
		System.out.println(comp.strength());
		System.out.println(comp.logoName());
		
		Company comp0 = (Company) factory.getBean("company");
		Company comp1 = (Company) factory.getBean("company");
		Company comp2 = (Company) factory.getBean("company");
		System.out.println(comp0.hashCode());
		System.out.println(comp1.hashCode());
		System.out.println(comp2.hashCode());
		

	}

}
