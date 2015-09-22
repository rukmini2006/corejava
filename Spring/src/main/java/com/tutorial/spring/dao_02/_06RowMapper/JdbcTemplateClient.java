package com.tutorial.spring.dao_02._06RowMapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.spring.dao_02._06RowMapper.employee.dao.EmployeeDAO;
import com.tutorial.spring.dao_02._06RowMapper.employee.model.Employee;

public class JdbcTemplateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/spring/dao_02/_06RowMapper/employee/Employee.xml");
			EmployeeDAO employeeDao = (EmployeeDAO) context.getBean("CustomerDao");
			Employee employee1 = new Employee(1, "Testing1", 21);
			Employee employee2 = new Employee(2, "testing2", 23);
			//create table employee_bk
			List<Employee> employees = new ArrayList<Employee>();
			employees.add(employee1);
			employees.add(employee2);
			//employees.add(emp3);

			employeeDao.insertBatch(employees);
		
			
	}

}
