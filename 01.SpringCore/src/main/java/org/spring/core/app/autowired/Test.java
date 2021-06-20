package org.spring.core.app.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");

		Employee employee = context.getBean("emp1", Employee.class);
		
		System.out.println(employee);
	}

}
