package com.DO;

import java.io.Serializable;

public class EmployeeDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
  private	int empid;
  private String fname;
  private String lname;
  private String email;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  
  

}
