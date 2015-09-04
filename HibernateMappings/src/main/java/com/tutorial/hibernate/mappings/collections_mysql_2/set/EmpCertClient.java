package com.tutorial.hibernate.mappings.collections_mysql_2.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpCertClient {
	private static SessionFactory factory;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			factory = new Configuration().configure("hibernate.mysql.cfg.xml")
					.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		HashSet set1 = new HashSet();
		// ArrayList list = new ArrayList(); // Only for List and Bag

		// Below is only for Map //
		/*
		 * HashMap set = new HashMap(); set.put("ComputerScience", new
		 * Certificate("MCA")); set.put("BusinessManagement", new
		 * Certificate("MBA")); set.put("ProjectManagement", new
		 * Certificate("PMP"));
		 */

		set1.add(new Certificate2("SCJP"));
		set1.add(new Certificate2("SCWCD"));
		set1.add(new Certificate2("MBA"));

		EmpCertClient ec = new EmpCertClient();
		//EmpCertClient ec1 = new EmpCertClient();

		ec.addEmployee("Jayram", "Rout", 5000, set1);
		/*HashSet set2 = new HashSet();
		set2.add(new Certificate2("MATH"));//set will not allows duplicates
		set2.add(new Certificate2("MATH"));
		set2.add(new Certificate2("DotNet"));

		ec1.addEmployee("rukmini", "bathula", 2000000, set2);
		 ec.listEmployees();
*/		// ec1.listEmployees();
		// ec.updateEmployee(1, 3456);
		// ec1.updateEmployee(5, 2312);
		//ec1.deleteEmployee(5);
		// ec.deleteEmployee(1);

	}

	public Integer addEmployee(String fname, String lname, int salary, Set set1) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try {
			tx = session.beginTransaction();
			Employee2 employee = new Employee2(fname, lname, salary);
			employee.setCertificates(set1);
			employeeID = (Integer) session.save(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employeeID;
	}

	/* Method to list all the employees detail */
	public void listEmployees() {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List employees = session.createQuery("FROM Employee2").list();
			for (Iterator iterator1 = employees.iterator(); iterator1.hasNext();) {
				Employee2 employee = (Employee2) iterator1.next();
				System.out.print("First Name: " + employee.getFirstName());
				System.out.print(" Last Name: " + employee.getLastName());
				System.out.println(" Salary: " + employee.getSalary());
				Set certificates = employee.getCertificates();
				for (Iterator iterator2 = certificates.iterator(); iterator2
						.hasNext();) {
					Certificate2 certName = (Certificate2) iterator2.next();
					System.out.println("Certificate: " + certName.getName());
				}
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to update salary for an employee */
	public void updateEmployee(Integer EmployeeID, int salary) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee2 employee = (Employee2) session.get(Employee2.class,
					EmployeeID);
			employee.setSalary(salary);
			session.update(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to delete an employee from the records */
	public void deleteEmployee(Integer EmployeeID) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee2 employee = (Employee2) session.get(Employee2.class,
					EmployeeID);
			session.delete(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
