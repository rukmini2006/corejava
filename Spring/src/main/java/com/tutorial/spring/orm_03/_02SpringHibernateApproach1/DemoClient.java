package com.tutorial.spring.orm_03._02SpringHibernateApproach1;

import java.util.Iterator;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/spring/orm_03/_02SpringHibernateApproach1/springHibernate.xml");
		BeanFactory factory = (BeanFactory) context;
		DemoInter demo=(DemoInter) factory.getBean("demoImpl");
		Iterator i1=demo.getData();
		while(i1.hasNext()){
			DBUser u1=(DBUser) i1.next();
			System.out.println(u1.getUid() + " " + u1.getUname() + " "
					+ u1.getCreatedBy() + " "+u1.getCreatedDate());
		}

}
}
