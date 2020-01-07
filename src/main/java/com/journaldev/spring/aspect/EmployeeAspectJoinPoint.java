package com.journaldev.spring.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspectJoinPoint {

	/*
	 * @Before("execution(public void com.journaldev.spring.model.*.set*(*))")
	 * public void loggingAdvice(JoinPoint joinPoint){
	 * System.out.println("before running logging advice on method="+joinPoint.
	 * toString());
	 * 
	 * System.out.println("Arugment passed="+ Arrays.toString(joinPoint.getArgs()));
	 * }
	 */
	
	@Before("args(name)")
	public void logStringArgument(String name) {
		System.out.println("String arugment passed"+name);
	}

}
