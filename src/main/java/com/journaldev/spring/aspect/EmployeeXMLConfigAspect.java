package com.journaldev.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class EmployeeXMLConfigAspect {
	
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("EmployeeXMLConfigAspect:employeeAroundAdvice: before invoking getname() ");
		Object object= null;
		try {
			object =proceedingJoinPoint.proceed();
			
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("EmployeeXMLConfigAspect:employeeAroundAdvice: after invoking getname() ");
		return object;
	}

}
