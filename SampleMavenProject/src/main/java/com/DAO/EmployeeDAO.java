package com.DAO;

import java.util.List;

import com.DO.EmployeeDO;

public interface EmployeeDAO{
	/**
	 * 
	 * @param empid
	 * @return
	 */
	public EmployeeDO getEmployeeDetails(String empid);
	public List<EmployeeDO> getEmployees();
}