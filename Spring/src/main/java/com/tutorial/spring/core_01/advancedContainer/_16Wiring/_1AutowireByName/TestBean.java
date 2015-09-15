package com.tutorial.spring.core_01.advancedContainer._16Wiring._1AutowireByName;

public class TestBean {
String msg;

public TestBean() {
	super();
	System.out.println("zero arg. constructor of TestBean class. ");
}

/*public String getMsg() {
	return msg;
}*/

public void setMsg(String msg) {
	System.out.println("setMsg() of TestBean class");
	this.msg = msg;
}

@Override
public String toString() {
	return "Testbean [msg=" + msg + "]";
}


}
