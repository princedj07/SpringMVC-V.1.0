package org.spring.core.app.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		context.registerShutdownHook();
		
//		Samosa samosa = (Samosa)context.getBean("samosa1");	
//		System.out.println(samosa);
//		System.out.println("\n**********************************************************************");		
//		Pespsi pespsi = (Pespsi)context.getBean("pepsi1");
//		System.out.println(pespsi);
		
		DhosaAnotation dhosaAnotation = (DhosaAnotation)context.getBean("dhosa1");
		System.out.println(dhosaAnotation);
		
		
	}

}
