package com.tutorial.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.tutorial.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	public String getHelloWorld(String name) {
		
		return " Hello World Welcome " +" " +name;
	}

	public Address getAddress(String name) {
		// TODO Auto-generated method stub
		return new Address();
	}

}
