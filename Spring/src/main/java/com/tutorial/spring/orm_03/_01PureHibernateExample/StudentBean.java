package com.tutorial.spring.orm_03._01PureHibernateExample;

import java.io.Serializable;

public class StudentBean implements Serializable{

	private int sid;
	private String sname;
	private float tot_m;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getTot_m() {
		return tot_m;
	}
	public void setTot_m(float tot_m) {
		this.tot_m = tot_m;
	}
	
	
	
}
