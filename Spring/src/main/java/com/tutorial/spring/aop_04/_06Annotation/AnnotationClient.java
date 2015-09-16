package com.tutorial.spring.aop_04._06Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.spring.aop_04._06Annotation.customer.Customer;

public class AnnotationClient {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/spring/aop_04/_06Annotation/spring-AOP-Annotation.Customer.xml");	
		Customer imple = (Customer) context.getBean("customerBo");
		//imple.addCustomerAround("rukmini");
		//imple.addCustomerAround("rukmini");
		imple.addCustomer();
		imple.addCustomerReturnValue();
		imple.addCustomerThrowException();
	}
}
