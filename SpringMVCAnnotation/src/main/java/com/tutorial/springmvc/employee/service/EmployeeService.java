package com.tutorial.springmvc.employee.service;

import org.springframework.stereotype.Component;

import com.tutorial.springmvc.employee.model.Employee;
@Component
public interface EmployeeService {
	public Employee getEmployeeDetail(int empId);
}
