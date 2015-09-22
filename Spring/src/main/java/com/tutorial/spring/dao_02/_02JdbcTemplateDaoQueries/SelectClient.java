package com.tutorial.spring.dao_02._02JdbcTemplateDaoQueries;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tutorial/spring/dao_02/_02JdbcTemplateDaoQueries/applicationContext.xml");
		SelectImple inter = (SelectImple) context.getBean("sel");

		System.out.println("Employee count with Clerk disgnation is: "
				+ inter.getEmpCount("AD_PRES"));

		System.out.println("Clerk designation employees details are: ");

		List l = inter.getEmpDetails("IT_PROG");
		for (int i = 0; i < l.size(); i++) {
			Map m1 = (Map) l.get(i);
			System.out.println(m1.toString());
		}

		System.out.println("Employee Details using map: ");

		Map m2 = inter.getEmpDetails(100);
		System.out.println(m2);

		boolean bool = inter.registerEmp(500, "rukmini ", "mortha","softwre", 400000);
		System.out.println("Employee registered " + bool);
		
		/*boolean bool = inter.modifyDesignation(120, "software");
		System.out.println("modified employee designation as  "+bool);
*/
		/*boolean bool = inter.fireEmp(126);
		System.out.println("Deleted employee is  "+bool);*/
		// System.out.println(inter.getEmpCount("IT_PROG"));
		// System.out.print(inter.getEmpDetails("IT_PROG"));
	}

}
