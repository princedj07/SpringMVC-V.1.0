package org.spring.core.app.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("reference.xml");

		ClassA classA = (ClassA) context.getBean("aref");
		
		System.out.println(classA.getX());
		System.out.println(classA.getClassBObj().getY());
		
		
		
	}

}
