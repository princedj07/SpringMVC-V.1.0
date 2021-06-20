package org.spring.core.di.app;

public class Bike {

	private String color;

	// using constructor injection
	public Bike(String color) {
		super();
		this.color = color;
		System.out.println("I am Param Constructor...");
	}

	// using setter injection
	public void setColor(String color) {
		this.color = color;
		System.out.println("I am Setter....");
	}
	
	public void showColor() {
		System.out.println("Your Color is----: "+color);
	}
	
	
}
