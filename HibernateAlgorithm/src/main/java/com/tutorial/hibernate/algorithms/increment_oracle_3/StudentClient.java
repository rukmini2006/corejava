package com.tutorial.hibernate.algorithms.increment_oracle_3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tutorial.hibernate.algorithms.domain.StudentBean;

class StudentClient {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.oracle.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		StudentBean st1 = new StudentBean();

		String name = "Incremental";
		float tot_m = 400;

		// st1.setSid(sid);
		st1.setSname(name);
		st1.setTot_m(tot_m);

		// creation of Transaction object as we are modifying database table
		Transaction tx = ses.beginTransaction();

		ses.persist(st1);
		tx.commit();
		ses.close();
		System.out.println("Record Inserted!");
		factory.close();
	}
}
