package org.spring.core.ioc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Keys{

	public void running(Engine key) {		
		key.start();
	}
	
}

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/org/spring/core/ioc/app/ioc.xml");

		Engine engine = (Engine)context.getBean("engines");
		new Keys().running(engine);
	}
}
