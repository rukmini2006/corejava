package com.tutorial.spring.core_01.coreContainer._11StaticFactory;

import java.util.Calendar;

public class DemoInterImpl implements DemoInter {
	
	private Calendar cal = null;
	private TestBean tb = null;
	
	

	public DemoInterImpl() {
		System.out.println("DemoInterImpl.DemoInterImpl()");
	}



	public void setTb(TestBean tb) {
		this.tb = tb;
	}



	public void setCal(Calendar cal) {
		this.cal = cal;
	}



	public String sayHello() {
		// TODO Auto-generated method stub
		Calendar cal =Calendar.getInstance();
		return "cl= " +cal.toString();
	}

}
