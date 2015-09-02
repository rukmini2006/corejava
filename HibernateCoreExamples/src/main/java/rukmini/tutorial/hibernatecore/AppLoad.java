package rukmini.tutorial.hibernatecore;

import org.hibernate.Session;

import rukmini.tutorial.hibernatecore.util.HibernateUtil;
import rukmini.tutorial.user.DBUSER;

public class AppLoad {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		/**
		 * Returns POJO Object
		 * Its lazy loading till we call the get methods.
		 * If no rows in db then it throws Exception : org.hibernate.ObjectNotFoundException
		 */
		DBUSER obj = null;
		//obj = (DBUSER)session.load(DBUSER.class,104);
		//System.out.println("AppGet.main() 1" + obj.getCreatedBy());

		/**
		 * Returns Void
		 * its Early Loading
		 * If no rows in db then it throws Exception : org.hibernate.ObjectNotFoundException
		 */
		obj = new DBUSER();
		session.load(obj,104);
		
	System.out.println("AppGet.main() 2 " + obj.getUserId());
		
		session.close();
	}
}