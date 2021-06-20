package org.spring.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

		Company company = context.getBean("company", Company.class);
		
		company.showDetails();
		company.engineer.development();
		
	}
}
