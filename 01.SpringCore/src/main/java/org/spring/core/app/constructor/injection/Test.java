package org.spring.core.app.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor.xml");
		
		Person person = (Person)context.getBean("person1");		
		System.out.println(person);
		
		Addition addition = (Addition)context.getBean("add1");
		addition.doSum();
		
		
	}

}
