package org.spring.core.di.object.app;

public class Bike {

	private Engine engine;

	public Bike() {
		super();
		System.out.println("Object Creation...");
	}

	public Bike(Engine engine) {
		super();
		this.engine = engine;
		System.out.println("I am Bike Constructor...");
	}

	public void startEngine() {

		if (engine == null) {
			System.out.println("Unable to start Engine");
		} else {
			engine.start();
		}
	}
	
	
	
}
