package rukmini.tutorial.hibernatecore;

import java.util.Date;

import org.hibernate.Session;

import rukmini.tutorial.hibernatecore.util.HibernateUtil;
import rukmini.tutorial.user.DBUSER;

public class AppSaveUpdate {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUSER user = new DBUSER();
		user.setUserId(104);
		user.setUsername("superman1");
		user.setCreatedBy("system Engineer");
		user.setCreatedDate(new Date());
		/**
		 * Returns VOID
		 * Selects if row is there..if not then inserts...if there then updates
		 */
		session.saveOrUpdate(user);
		session.getTransaction().commit();
		
		session.close();
	}
}//Next AppDelete