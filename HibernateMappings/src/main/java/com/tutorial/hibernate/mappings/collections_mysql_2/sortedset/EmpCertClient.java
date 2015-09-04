package com.tutorial.hibernate.mappings.collections_mysql_2.sortedset;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tutorial.hibernate.mappings.collections_mysql_2.set.Employee2;

public class EmpCertClient {
	private static SessionFactory factory;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{ 
			factory = new Configuration().configure("hibernate.mysql.cfg.xml").buildSessionFactory(); 
		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex); 
			throw new ExceptionInInitializerError(ex); 
		}

/*
		TreeSet set1 = new TreeSet();
		set1.add(new Certificate2("MCA")); 
		set1.add(new Certificate2("MBA")); 
		set1.add(new Certificate2("PMP"));

		EmpCertClient ec = new EmpCertClient();
		

		ec.addEmployee("Jayram", "Rout", 5000, set1);*/
		listEmployees();

	}
	public Integer addEmployee(String fname, String lname, int salary, SortedSet cert){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		Integer employeeID = null; 
		try{ 
			tx = session.beginTransaction(); 
			Employee2 employee = new Employee2(fname, lname, salary); 
			employee.setCertificates(cert); 
			employeeID = (Integer) session.save(employee); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
		return employeeID; 
	}

	/* Method to list all the employees detail */ 
	public static void listEmployees( ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ tx = session.beginTransaction(); 
		List employees = session.createQuery("FROM Employee2").list(); 
		for (Iterator iterator1 = employees.iterator();iterator1.hasNext();){ 
			Employee2 employee = (Employee2) iterator1.next(); 
			System.out.print("First Name: " + employee.getFirstName()); 
			System.out.print(" Last Name: " + employee.getLastName()); 
			System.out.println(" Salary: " + employee.getSalary()); 
			Set certificates = employee.getCertificates(); 
			for (Iterator iterator2 = certificates.iterator(); iterator2.hasNext();){ 
				Certificate2 certName = (Certificate2) iterator2.next(); 
				System.out.println("Certificate: " + certName.getName()); 
			} 
		} 
		tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
	}

	/* Method to update salary for an employee */ 
	public static void updateEmployee(Integer EmployeeID, int salary ){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			Employee2 employee = (Employee2)session.get(Employee2.class, EmployeeID); 
			employee.setSalary( salary ); 
			session.update(employee); 
			tx.commit(); 
		}catch (HibernateException e) {
			if (tx!=null) 
				tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
	} 
	/* Method to delete an employee from the records */ 
	public  static void deleteEmployee(Integer EmployeeID){ 
		Session session = factory.openSession(); 
		Transaction tx = null; 
		try{ 
			tx = session.beginTransaction(); 
			Employee2 employee = (Employee2)session.get(Employee2.class, EmployeeID); 
			session.delete(employee); 
			tx.commit(); 
		}catch (HibernateException e) { 
			if (tx!=null) tx.rollback(); 
			e.printStackTrace(); 
		}finally { 
			session.close(); 
		} 
	}
}

