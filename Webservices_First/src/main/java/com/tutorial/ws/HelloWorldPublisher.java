package com.tutorial.ws;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:6669/ws/hello", new HelloWorldImpl());
		System.out.println("suceesssfully published ");
	}

}
