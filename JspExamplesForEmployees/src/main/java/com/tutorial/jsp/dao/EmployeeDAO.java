package com.tutorial.jsp.dao;

import java.util.List;

import com.tutorial.jsp.DO.EmployeeDO;

public interface EmployeeDAO{
	/**
	 * 
	 * @param empid
	 * @return
	 */
	public EmployeeDO getEmployeeDetails(String empid);
	public List<EmployeeDO> getEmployees();
}