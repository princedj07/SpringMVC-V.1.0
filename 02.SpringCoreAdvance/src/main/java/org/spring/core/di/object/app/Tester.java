package org.spring.core.di.object.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/org/spring/core/di/object/app/diobject.xml");

		Bike bike = context.getBean("bike", Bike.class);
		bike.startEngine();
		
		Car car = context.getBean("car", Car.class);
		car.startEngine();
		
	}
}
