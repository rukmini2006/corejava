package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.DO.EmployeeDO;
import com.tutorial.hibernate.hql.EmployeeClient;

public class EmployeeDAOImpl implements EmployeeDAO{
	private static Logger log = Logger.getLogger(EmployeeDAO.class);	
	EmployeeClient ec=null;

	
	public EmployeeDAOImpl() {
		
	}
	
	public List<EmployeeDO> getEmployees(){
		ec=new 	EmployeeClient();
		List<EmployeeDO> employeeList=ec.invoke();
		return employeeList;	
	}
	public EmployeeDO getEmployeeDetails(String empid){
		EmployeeDO empdo = new EmployeeDO();
		ec=new 	EmployeeClient();
		empdo=(EmployeeDO) ec.invoke(empid);
		return empdo;
	}
	
}