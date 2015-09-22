package com.tutorial.spring.orm_03._01PureHibernateExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// activate hibernate software
		Configuration configuration = new Configuration();
		configuration = configuration
				.configure("com/tutorial/spring/orm_03/_01PureHibernateExample/hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		// getting session from session factory
		Session session = factory.openSession();
		// creating a student object
		StudentBean st1 = new StudentBean();
		// setting values into student bean
		st1.setSid(129);
		st1.setSname("rukmini");
		st1.setTot_m(100.0f);
		// creation of Transaction object as we are modifying database table
		Transaction tx = session.beginTransaction();
		session.save(st1);
		tx.commit();
		System.out.println("Record inserted ");
		session.close();
		factory.close();

	}

}
