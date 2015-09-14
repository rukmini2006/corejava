package com.tutorial.spring.core_01.coreContainer._12InstanceFactory;

public class DemoImpl implements DemoInter {
	private TestBean tb = null;

	public DemoImpl() {
		System.out.println("zero parametrized constructor of DemoBean class");
	}

	public void setTb(TestBean tb) {
		this.tb = tb;
	}

	

	public String sayHello() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// instance factory method
		public TestBean getTestBean(String msg) {
			System.out.println("instance factory method of DemoBean class");
			return new TestBean(msg);
		}

}
