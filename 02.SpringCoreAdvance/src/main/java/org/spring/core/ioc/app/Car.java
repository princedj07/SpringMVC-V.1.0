package org.spring.core.ioc.app;

public class Car implements Engine{

	@Override
	public void start() {
		System.out.println("Car has been started....");
	}

}
