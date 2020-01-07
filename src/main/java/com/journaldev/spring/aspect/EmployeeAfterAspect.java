package com.journaldev.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {
	
	@After("args(name)")
	public void logStringArgument(String name) {
		System.out.println("running after advice. String argument "+name);
	}
	
	@AfterReturning("within(com.journaldev.spring.service.Employee)")
	public void logException(JoinPoint joinPoint) {
		System.out.println();
	}
	
	@AfterReturning(pointcut = "execution(* getName())", returning="returnString")
	public void getNameReturningAdvice(String returnString) {
		System.out.println("getNameReturningAdvice executed. returned string="+returnString);
	}
}
