package com.tutorial.spring.aop_04._06Annotation.aspect;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect1 {
	private static final Logger LOGGER = Logger.getLogger(LoggingAspect1.class);

	@Before("execution(* com.tutorial.spring.aop_04._06Annotation.customer.Customer.addCustomer(..))")
	public void logBefore(JoinPoint joinpoint) {
		LOGGER.info("logBefore() is running!");
		LOGGER.info("hi jacked :" + joinpoint.getSignature().getName());
		LOGGER.info("*******");

	}

	@After("execution(* com.tutorial.spring.aop_04._06Annotation.customer.Customer.addCustomer(..))")
	public void logAfter(JoinPoint joinpoint) {
		LOGGER.info("logAfter() is running");
		LOGGER.info("hi jacked" + joinpoint.getSignature().getName());
		LOGGER.info("*********");
	}

	@AfterReturning(pointcut = "execution(* com.tutorial.spring.aop_04._06Annotation.customer.Customer.addCustomerReturnValue(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinpoint, Object result) {
		LOGGER.info("logAfterReturning() is running");
		LOGGER.info("Hi Jacked" + joinpoint.getSignature().getName());
		LOGGER.info("Method returned value is : " + result);
		LOGGER.info("*******");

	}

	@AfterThrowing(pointcut = "execution(* com.tutorial.spring.aop_04._06Annotation.customer.Customer.addCustomerThrowException(..))", throwing = "error")
	public void logAfterThrowing(JoinPoint joinpoint, Throwable error) {
		LOGGER.info("logAfterThrowing() is running");
		LOGGER.info("Hi jacked" + joinpoint.getSignature().getName());
		LOGGER.info("Exception : " + error);
		LOGGER.info("*****");
	}

	@Around("execution(* com.tutorial.spring.aop_04._06Annotation.customer.Customer.addCustomerAround(..))")
	public void logAround(ProceedingJoinPoint joinpoint) throws Throwable {
		LOGGER.info("logAround() is runninng");
		LOGGER.info("Hi jacked" + joinpoint.getSignature().getName());
		LOGGER.info("hijacked arguments : "
				+ Arrays.toString(joinpoint.getArgs()));

		LOGGER.info("Around before is running!");
		joinpoint.proceed();
		LOGGER.info("Around after is running!");
		LOGGER.info("********");

	}
}
