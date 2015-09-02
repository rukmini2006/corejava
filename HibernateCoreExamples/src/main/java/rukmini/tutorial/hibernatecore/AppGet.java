package rukmini.tutorial.hibernatecore;

import org.hibernate.Session;

import rukmini.tutorial.hibernatecore.util.HibernateUtil;
import rukmini.tutorial.user.DBUSER;

public class AppGet {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		/**
		 * When you do a get you do not have to begin or commit the transation.
		 */
		/**
		 * Returns POJO Object
		 * Its early loading
		 * If no rows in db then it returns null
		 * Its Early loading.
		 */
		DBUSER obj = (DBUSER)session.get(DBUSER.class,111);
	System.out.println("AppGet.main()" + obj);
		session.close();
	}
}//Next AppLoad