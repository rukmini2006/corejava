package com.tutorial.springmvc.employee.service;



import org.springframework.stereotype.Component;

import com.tutorial.springmvc.employee.DAO.EmployeeDao;
import com.tutorial.springmvc.employee.DAO.EmployeeDaoImpl;
import com.tutorial.springmvc.employee.model.Employee;


@Component
public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao employeeDao = new EmployeeDaoImpl();

	public Employee getEmployeeDetail(int empId) {
		Employee emp= employeeDao.getEmployeeDetail(empId);
		return emp;
		
		}
	
		
		


}


