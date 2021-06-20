package org.spring.core.app.constructor.injection;

public class Addition {

	private int a;
	private int b;
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Addition.Addition(int a, int b)");
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Addition.Addition(double a, double b)");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Addition.Addition(String a, String b)");
	}
	
	public void doSum() {
		System.out.println("Sum is----: "+(this.a + this.b));
	}
	
}
