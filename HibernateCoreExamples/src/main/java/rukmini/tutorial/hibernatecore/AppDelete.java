package rukmini.tutorial.hibernatecore;

import org.hibernate.Session;

import rukmini.tutorial.hibernatecore.util.HibernateUtil;
import rukmini.tutorial.user.DBUSER;

public class AppDelete {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUSER user = new DBUSER();
		user.setUserId(206);
		/**
		 * Returns VOID
		 * Selects if row is there..if there then deletes...else ignores
		 */
		session.delete(user);
		session.getTransaction().commit();
		
		session.close();
	}
}//Next AppGet