package com.tutorial.spring.core_01.coreContainer._11StaticFactory;

import java.util.Calendar;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource res = new ClassPathResource(
				"com/tutorial/spring/core_01/coreContainer/_11StaticFactory/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Calendar calender = factory.getBean("cal", Calendar.class);
		System.out.println("DemoClient.main()"+calender);

	}

}
