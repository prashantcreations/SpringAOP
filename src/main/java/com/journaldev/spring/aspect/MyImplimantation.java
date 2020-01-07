package com.journaldev.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyImplimantation 
{
	 @Before("execution(public void com.journaldev.spring.model.*.set*(*))")
	public void setNameAdvice(JoinPoint joinPoint) {
		System.out.println("in setNameAdvice :- "+joinPoint.getArgs());
		System.out.println("in setNameAdvice :- "+joinPoint.toString());
	}
	 @Before("args(name)")
	 public void allArument(String name) {
		 System.out.println("allArument "+name);
	 }
	
	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("in getNameAdvice");
	}
	
	@Before("execution(* com.journaldev.spring.service.*.get*())")
	public void getAllAdvice() {
		System.out.println("in getAllAdvice");
	}
	
	@Pointcut("execution(public String setName(*))")
	public void setNamePointCut() {
	}
	
	@Pointcut("execution(public String getName())")
	public void getNamePointCut() {
	}
	
	@Pointcut("within(com.journaldev.spring.service.*)")
	public void getAllPointCut() {
	}
	
	@Before("getNamePointCut()")
	public void loggingAdvice() {
		System.out.println("in getNamePointCut loggingAdvice");
	}

	@Before("getAllPointCut()")
	public void getallMethodAdvice() {
		System.out.println("in getAllPointCut getallMethodAdvice");
	}
	
	
	
	// after 
	@After("args(name)")
	public void logStringArugmnent(String name) {
		System.out.println(" logStringArugmnent after ="+name);
	}
	
	@AfterThrowing("within(com.journaldev.spring.service.*)")
	public void getAllException(JoinPoint joinPoint) {
		System.out.println("exception we are getting "+joinPoint.toString());
	}
	
	@AfterReturning(pointcut = "execution(* getName())", returning = "returnString")
	public void getReturnValue(String returnString) {
		System.out.println("return string === "+returnString);
	}
	
}
