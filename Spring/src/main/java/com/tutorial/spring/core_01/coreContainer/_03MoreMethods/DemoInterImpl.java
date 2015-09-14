package com.tutorial.spring.core_01.coreContainer._03MoreMethods;

import java.util.Calendar;

public class DemoInterImpl implements DemoInter{
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String wish(String uname) {
		String str="";
		Calendar cal = 	Calendar.getInstance();
		int hour =cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			str = "Good Morning";
		else if(hour<17)
			str="good afternoon";
		else
			str="good evening";
		return message + " " +str+ uname;
		
}
}
