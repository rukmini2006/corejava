package rukmini.tutorial.hibernatecore;

import java.util.Date;

import org.hibernate.Session;

import rukmini.tutorial.hibernatecore.util.HibernateUtil;
import rukmini.tutorial.user.DBUSER;

public class AppMerge {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUSER user = new DBUSER();
		user.setUserId(305);
		user.setUsername("Sundar");
		user.setCreatedBy("system Eng2");
		user.setCreatedDate(new Date());
		/**
		 * uses Select to check If row is present then it updates else it inserts
		 * It retruns the POJO Object
		 */
		DBUSER obj = (DBUSER)session.merge(user);
		System.out.println("AppMerge.main()" + obj.getUserId());
		session.getTransaction().commit();
		
		session.close();
	}
} // Next AppSaveUpdate