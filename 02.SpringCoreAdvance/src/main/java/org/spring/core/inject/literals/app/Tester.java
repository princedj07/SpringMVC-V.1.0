package org.spring.core.inject.literals.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	private static ApplicationContext context;
	
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("/org/spring/core/inject/literals/app/literals.xml");
//		context = new ClassPathXmlApplicationContext("/literals.xml");
		
		Employee employee = context.getBean("emp1", Employee.class);
		employee.showEmpDetails();
		
	}
}
