package org.spring.core.di.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/org/spring/core/di/app/di.xml");

		Bike bike = context.getBean("bike", Bike.class);
		bike.showColor();
		
	}
}
