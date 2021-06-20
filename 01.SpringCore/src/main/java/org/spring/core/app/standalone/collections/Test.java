package org.spring.core.app.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("standAcollection.xml");
		Person person = (Person)context.getBean("person1");
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("________________________________________________________________________________________");
		System.out.println(person.getFeeStructure());
		System.out.println(person.getFeeStructure().getClass().getName());
		System.out.println("________________________________________________________________________________________");
		System.out.println(person.getProperties());
	}

}
