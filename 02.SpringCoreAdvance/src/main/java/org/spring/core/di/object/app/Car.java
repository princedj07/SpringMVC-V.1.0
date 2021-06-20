package org.spring.core.di.object.app;

public class Car {

	private Engine engine;

	public Car() {
		super();
		System.out.println("Object Creation...2");
	}

	public Car(Engine engine) {
		super();
		this.engine = engine;
		System.out.println("I am Car Constructor...");
	}

	public void startEngine() {

		if (engine == null) {
			System.out.println("Unable to start Engine");
		} else {
			engine.start();
		}
	}

}
