package com.tutorial.spring.dao_02._04NamedParameter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tutorial/spring/dao_02/_04NamedParameter/applicationContext.xml");
		SelectImple inter = (SelectImple) context.getBean("sel");
		System.out.println("Employees count is "+inter.getEmpCount(102, 108));

	}

}
