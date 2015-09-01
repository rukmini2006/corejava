package com.tutorial.hibernate.cache.level1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tutorial.hibernate.cache.domain.StudentBean;

public class StudentClient 
{
	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();
		cfg  = cfg.configure();
		@SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();
		
		//Use StatelessSession if you do not use evict 
//		StatelessSession ses1 = factory.openStatelessSession();
		
		Session ses1 = factory.openSession();
		Session ses2 = factory.openSession();
		StudentBean st1= new StudentBean();
		
		ses1.beginTransaction();
		//creation of StudentBean class object
		/*st1.setSid(108);
		st1.setSname("rohini");
		st1.setTot_m(60f);
		ses1.save(st1);
		ses1.getTransaction().commit();*/
		
		st1 = (StudentBean) ses1.get(StudentBean.class, new Integer(105)); 
		System.out.println(st1.getSid()+" "+st1.getSname()+" "+st1.getTot_m());
		
		st1 = (StudentBean) ses2.get(StudentBean.class, new Integer(105)); 
		System.out.println(st1.getSid()+" "+st1.getSname()+" "+st1.getTot_m());
		
		/*ses1.evict(st1);
		try{
			Thread.sleep(5000);
		}catch(Exception exp0){}
		
		st1 = (StudentBean) ses1.get(StudentBean.class, new Integer(105)); 
		System.out.println(" Record values are :");
		System.out.println(st1.getSid()+" "+st1.getSname()+" "+st1.getTot_m());*/
		/**
		 * When ever we need to remove any persistent state object explicitly from our level 1 cache then
		 * we can call evict(_) method belongs to session object
		*/
//		ses1.evict(st1);
		//st1 = (StudentBean) ses1.get(StudentBean.class, new Integer(105));
		//System.out.println("Record Values r: ");
		//System.out.println(st1.getSid()+" "+st1.getSname()+" "+st1.getTot_m());
		
		ses1.close();	
		factory.close();
	}
}
