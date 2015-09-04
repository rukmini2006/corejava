package com.tutorial.hibernate.mappings.component;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tutorial.hibernate.pojo.JobType;
import com.tutorial.hibernate.pojo.Person;

public class InnerTest {

	public static void main(String[] args) {
		Session ses=null;
		try
		{
			Configuration cfg = new Configuration();
			//read configuration file
			cfg  = cfg.configure("hibernate.oracle.cfg.xml");
			// create SessionFactory 
			SessionFactory factory = cfg.buildSessionFactory();
			ses = factory.openSession();
			Transaction tx= ses.beginTransaction();
			
			Person p1= new Person();
			
			JobType j1= new JobType();
			j1.setJob("software");
			j1.setSalary(40000);
			j1.setDepartment(101);
			
			p1.setPname("rukmni");
			p1.setPjob(j1);
			
			Person p2 = new Person();
			JobType j2 = new JobType();
			j2.setJob("Harware engineer");
			j2.setSalary(80000);
			j2.setDepartment(201);
			
			p2.setPname("Prakash");
			p2.setPjob(j2);
			
			ses.save(p1);
			ses.save(p2);
			tx.commit();
			
			System.out.println("records are inserted successfully ");
		}catch(HibernateException e){
			e.printStackTrace();
		}
			ses.close();
		
	}
	
}
