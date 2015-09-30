package com.tutorial.springmvc.employee.DAO;

import org.springframework.stereotype.Component;

import com.tutorial.springmvc.employee.model.Employee;
@Component
public interface EmployeeDao {
public Employee getEmployeeDetail(int empId);
}
