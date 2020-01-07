package com.journaldev.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointcut {

	// created two pointcut methos and can use wiht multipule advice 
	
	@Pointcut("within(com.journaldev.spring.service.*)")
	public void allMethodPointcut() {
		
	}
	
	@Pointcut("execution(public String getName())")
	public void getNamePointcut() {
		
	}
	
	
	@Before("getNamePointcut()")
	public void loggingAdvice() {
		System.out.println("EmployeeAspectPointcut :loggingAdvice= Executing loggingadvice on getNamePointcut()");
	}
	
	@Before("getNamePointcut()")
	public void secondAdvice() {
		System.out.println("EmployeeAspectPointcut :loggingAdvice= Executing secondAdvice on secondAdvice()");
	}
	
	@Before("allMethodPointcut()")
	public void allServiceMethodAdvice(){
		System.out.println("EmployeeAspectPointcut :loggingAdvice= Executing allServiceMethodAdvice on allMethodPointcut()");
	}

}
