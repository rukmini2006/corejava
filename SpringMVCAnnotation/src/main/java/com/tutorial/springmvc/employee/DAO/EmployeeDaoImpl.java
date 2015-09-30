package com.tutorial.springmvc.employee.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

import com.tutorial.springmvc.employee.model.Employee;
@Component
public class EmployeeDaoImpl implements EmployeeDao{

	public Employee getEmployeeDetail(int empId) {
		System.out.println("rukmini database ");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees where employee_id= "+empId);
			Employee emp=new Employee();
			while(rs.next()){
				 emp.setUserName(rs.getString("FIRST_NAME"));
			}
			return emp;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}		
		

}

