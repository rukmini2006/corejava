package com.tutorial.spring.dao_02._01ConnectionPooling._01DAOConnectionPoolingDummy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/spring/dao_02/_01ConnectionPooling/_01DAOConnectionPoolingDummy/spring.cfg.xml");
		SelectInterImpl inter = (SelectInterImpl) context.getBean("sel");
		System.out.println(inter.fetchEmpName(100));
		System.out.println(inter.fetchEmpSalary(200));

	}

}
