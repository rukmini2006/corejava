package com.tutorial.spring.dao_02._01ConnectionPooling._01DAOConnectionPoolingDummy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class SelectInterImpl implements SelectInter {
	DataSource ds = null;
	

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public String fetchEmpName(int eno) {
		try {
			//get access to jdbc connection object from jdbc connection pool through data source object "ds"
			Connection con = ds.getConnection();
			//persistence logic
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select First_Name from employees where employee_id = "+eno);
			if(rs.next()){
				return rs.getString(1);
			}else {
				System.out.println("No record found with employee no "+eno);
			}
			rs.close();
			st.close();
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
			return "Record not found";
		} catch(Exception e) {
			e.printStackTrace();
			return "Record not found";
		}//catch
		return "Record not found";
	}//fetch empName

	public long fetchEmpSalary(int eno) {
		// TODO Auto-generated method stub
		try {
			Connection con = ds.getConnection();
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select salary from employees where employee_id = "+eno);
			if(rs.next()){
				return  rs.getLong(1);
			}else{
				System.out.println("No record found with employee number: "+eno);
			}
			rs.close();
			st.close();
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
			return 0;
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}//catch
		return 0;
	}//fetch empsalary
}
