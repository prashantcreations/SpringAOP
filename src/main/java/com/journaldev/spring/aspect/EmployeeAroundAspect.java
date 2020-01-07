package com.journaldev.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

//As explained earlier, we can use Around aspect to cut the method execution before and after.

@Aspect
public class EmployeeAroundAspect {
	
	@Around("execution(* com.journaldev.spring.model.Employee.getName())")
	public Object employeeAroundAdvice(ProceedingJoinPoint procedingJoinPoint) {
		System.out.println("Before invoke getName()");
		Object object = null;
		try {
			object = procedingJoinPoint.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After invoking getName()");
		return object;
	}
}
