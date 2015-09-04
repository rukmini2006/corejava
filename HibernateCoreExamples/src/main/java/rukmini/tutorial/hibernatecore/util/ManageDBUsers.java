package rukmini.tutorial.hibernatecore.util;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import rukmini.tutorial.user.DBUSER;

public class ManageDBUsers {
	private static SessionFactory factory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			factory= new Configuration().configure().buildSessionFactory();
		}catch(Throwable ex){
			System.err.println("Failed to create sessionFactory object." + ex); 
			throw new ExceptionInInitializerError(ex); 
		}
		ManageDBUsers manageusers = new ManageDBUsers();
		/*Add Few Records in database*/
	//Integer dbuser1 = manageusers.addDBUser(1, "Jayram", "rout", new Date());
	Integer dbuser2 = 	manageusers.addDBUser(2, "Sarita", "leela", new Date());
	//Integer dbuser3 =  	manageusers.addDBUser(3, "johnny","rukmini", new Date());
		//manageusers.listDbUsers();
		manageusers.UpdateDbUser(dbuser2, "krishna");
    
    }
		/* Method to create a DBUSER in database*/
	private Integer addDBUser(int userId, String username, String createdBy,
			Date createdDate) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction tx= null;
		Integer DBUserId=null;
		try{
			tx = session.beginTransaction();
			DBUSER DbUser =new DBUSER(userId,  username, createdBy,
					 createdDate); 
		DBUserId = (Integer) session.save(DbUser);
		tx.commit();
			
		}catch(HibernateException e){
			if(tx != null) tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return DBUserId;
	}
	
	/* Method to list Dbusers*/
	public void listDbUsers(){
		Session session = factory.openSession();
		Transaction tx= null;
		try{
			//session.beginTransaction();
		List dbuserList = session.createQuery("FROM DBUSER").list();
		for(Iterator iterator = dbuserList.iterator(); iterator.hasNext();){
			DBUSER dbUser = (DBUSER) iterator.next();
			System.out.println("User Id: "+dbUser.getUserId());
			System.out.println("UserName: "+dbUser.getUsername());
			System.out.println("Created by: "+dbUser.getCreatedBy());
			System.out.println("Created name: "+dbUser.getCreatedDate());
		}
			//tx.commit();
		}catch(HibernateException e){
			if(tx != null) 
				tx.rollback();
			
			
		}finally{
			session.close();
		}
		
	}
	/*Method toupdate salary for an dbuser*/
	public void UpdateDbUser(Integer dbuserId , String createdBy) {
		Session session = factory.openSession();
		Transaction tx = null;
		try{
			session.beginTransaction();
			System.out.println("Hi ");
			DBUSER dbuser = (DBUSER)session.get(DBUSER.class, dbuserId);
			dbuser.setCreatedBy(createdBy);
			session.update(dbuser);
			tx.commit();
			
		}catch(HibernateException e){
			if(tx!=null) 
				tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}

}
