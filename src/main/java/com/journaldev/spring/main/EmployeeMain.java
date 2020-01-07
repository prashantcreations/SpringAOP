package com.journaldev.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.service.EmployeeService;

public class EmployeeMain {
	
	public static void main(String arg[]) {
		ClassPathXmlApplicationContext cts = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService empService = cts.getBean("employeeService",EmployeeService.class);
		//System.out.println(empService.getEmployee().getName());
		empService.getEmployee().setName("Prashant");
		 empService.getEmployee().throwException();
		 cts.close();
	}

}
