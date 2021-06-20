package org.spring.core.autowire.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	private static ApplicationContext context;
	
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("/org/spring/core/autowire/app/autowire.xml");
		
		Company company = context.getBean("company", Company.class);
		company.companyWork();
	}
}
