package com.tutorial.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.tutorial.jsp.DO.EmployeeDO;

public class EmployeeDAOImpl implements EmployeeDAO{
	private static Logger log = Logger.getLogger(EmployeeDAO.class);	
	static Connection con = null;
	static Statement stmt =null;
	ResultSet rs = null;

	private static String driver = "oracle.jdbc.driver.OracleDriver";
	static String connectionURL = "jdbc:oracle:thin:@localhost:1521/XE";
	/**
	 * 
	 * @param rs
	 * @param stmt
	 * @param con
	 */
	private void closeConnections(ResultSet rs , Statement stmt , Connection con){
		try{
			if(rs != null){
				rs.close();
			}
			if(stmt != null){
				stmt.close();
			}
			if(con != null){
				con.close();
			}
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}
	/**
	 * 
	 */
	public EmployeeDAOImpl() {
		try{
			Class.forName(driver);//Loading a driver...
		}catch(ClassNotFoundException exp){
			exp.printStackTrace();
		}

		try{
			con = DriverManager.getConnection(connectionURL,"hr","hr");
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}
	/**
	 * 
	 * @param empid
	 * @return
	 */
	public List<EmployeeDO> getEmployees(){
		EmployeeDO empdo = null;
		
		List<EmployeeDO> empList = new ArrayList<EmployeeDO>();
		try{
			System.out.println("in DAO Impl ");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select employee_id, first_name , last_name,email from employees");
			
			while(rs.next()){
				empdo = new EmployeeDO();
				empdo.setEmpid(rs.getInt("employee_id")+"");
				empdo.setFname(rs.getString("first_name"));
				empdo.setLname(rs.getString("last_name"));
				empdo.setEmail(rs.getString("email"));
				
				empList.add(empdo);
			}

		}catch(SQLException exp){
			exp.printStackTrace();
		}finally{
			closeConnections(rs,stmt,con);
		}
		
		return empList;		
	}
	public EmployeeDO getEmployeeDetails(String empid){
		EmployeeDO empdo = new EmployeeDO();
		try{
			stmt = con.createStatement();
			System.out.println(" in Employee DAOImpl"+empid);
			rs = stmt.executeQuery("select employee_id, first_name , last_name,email from employees where employee_id ="+empid);
			while(rs.next()){
				empdo.setEmpid(rs.getInt("employee_id")+"");
				empdo.setFname(rs.getString("first_name"));
				empdo.setLname(rs.getString("last_name"));
				empdo.setEmail(rs.getString("email"));
			}

		}catch(SQLException exp){
			exp.printStackTrace();
		}finally{
			closeConnections(rs,stmt,con);
		}
		
		return empdo;
	}
	
}