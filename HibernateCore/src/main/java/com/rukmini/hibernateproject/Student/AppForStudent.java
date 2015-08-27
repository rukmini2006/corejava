package com.rukmini.hibernateproject.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;




public class AppForStudent {
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	public  static SessionFactory createSessionFactory(){
		Configuration configuration = new Configuration();
		configuration.configure();
		 serviceRegistry = new ServiceRegistryBuilder().applySettings(
		            configuration.getProperties()). buildServiceRegistry();
		    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		    return sessionFactory;
	}
		
	public static void main(String[] args) {
		sessionFactory =createSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		StudentUser user =new StudentUser();
		user.setStudentId(200);
		user.setStudentName("prakash");
		user.setAge(50);
		user.setCollege("VRSE");
		
		Integer i =(Integer) session.save(user);
		System.out.println("App.main() = "+i);
		session.getTransaction().commit();
		session.close();
		
		
		
	}

}
