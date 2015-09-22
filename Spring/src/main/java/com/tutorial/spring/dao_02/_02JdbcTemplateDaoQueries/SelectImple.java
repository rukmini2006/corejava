package com.tutorial.spring.dao_02._02JdbcTemplateDaoQueries;


import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class SelectImple implements SelectInter {
	JdbcTemplate jt;
	String qry;
	

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int getEmpCount(String desg) {
	qry="select count(*) from employees where job_id= ?";
	int count = jt.queryForInt(qry, new String[]{desg});
		return count;
	}

	public List getEmpDetails(String desg) {
		// TODO Auto-generated method stub
		qry = "select * from employees where job_id = ?";
		List list1=jt.queryForList(qry, new Object[]{desg}    );
		return list1;
	}

	public Map getEmpDetails(int eno) {
		// TODO Auto-generated method stub
		qry = "select * from employees where employee_id = ?";
		Map m1 = jt.queryForMap(qry, new Object[]{new Integer(eno)});
		return m1;
	}

	public boolean registerEmp(int no, String fname,String lname, String desg, int sal) {
		qry = "insert into employees(employee_id,first_Name,last_Name,job_id,salary,email,hire_date) values(?,?,?,?,?,?,?)";
		int res = jt.update(qry, new Object[]{new Integer(no),fname,lname,desg,new Integer(sal),"ruk@email",new Date()});
		if(res == 0){
		return false;
		}else{
			return true;
		}
	}

	public boolean modifyDesignation(int no, String desig) {
		// TODO Auto-generated method stub
		qry = "update employees set job_id=? where employee_id=?";
	int res = jt.update(qry, new Object[]{desig,new Integer(no)});
	if(res == 0){
		return false;
	}else{
		return true;
	}}
	

	public boolean fireEmp(int eno) {
		// TODO Auto-generated method stub
		qry = "delete from employees where employee_id=?";
		int res = jt.update(qry, new Object[]{new Integer(eno)});
		if (res == 0)
			return false;
		else
		return true;
	}

}
