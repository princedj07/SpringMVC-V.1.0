package org.spring.core.app.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
		Employee employee = (Employee) context.getBean("emp1");
		
		System.out.println("emp----: "+employee.getName());
		System.out.println("phn----: "+employee.getPhones());
		System.out.println("add----: "+employee.getAddresses());
		System.out.println("cur----: "+employee.getCources());
		
	}

}
