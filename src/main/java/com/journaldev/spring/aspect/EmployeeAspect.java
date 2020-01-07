package com.journaldev.spring.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // this is required for create aspect 
public class EmployeeAspect {

	//advice(point cut expression)
	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("EmployeeAspect:getNameAdvice= Executing advice on getName()");
	}

	@Before("execution(* com.journaldev.spring.service.*.get*())")
	public void getAllAdvice() {
		System.out.println("EmployeeAspect:getAllAdvice= Executing advice on getAllAdvice");
	}
	
	@Before("execution(public void com.journaldev.spring.model.*.set*(*))")
	public void loggingAdvice(JoinPoint joinPoint){
			System.out.println("==before running logging advice on method="+joinPoint.toString());
			
			System.out.println("===Arugment passed="+ Arrays.toString(joinPoint.getArgs()));
	}
		

}
