package rukmini.tutorial.hibernatecore;

import java.util.Date;

import org.hibernate.Session;

import rukmini.tutorial.hibernatecore.util.HibernateUtil;
import rukmini.tutorial.user.DBUSER;

public class AppUpdate {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DBUSER user = new DBUSER();
		user.setUserId(100);
		user.setUsername("Siva");
		user.setCreatedBy("net Eng");
		user.setCreatedDate(new Date());
		/**
		 * It updates. If row does not exists..then it throws Exception
		 */
		session.update(user);
		session.getTransaction().commit();
		session.close();
	}
}//Next AppMerge