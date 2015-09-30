package com.tutorial.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://localhost:6669/ws/hello?wsdl");
			/*
			 * QName represents a qualified name . 
			 * Here it takes Service URI and Service Name in the constructor.
			 * Service URI is on opposite order of the package name
			 */
			QName qname = new QName("http://ws.tutorial.com/", "HelloWorldImplService");
			Service service = Service.create(url, qname);
			HelloWorld hello = service.getPort(HelloWorld.class);
			System.out.println(hello.getHelloWorld("rukmini"));
			/*System.out.println(hello.getAddress("rukmini"));*/
			System.out.println(hello.getAddress("rukmni"));
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
