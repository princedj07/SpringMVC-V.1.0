package org.spring.core.app.reference;

public class ClassA {

	private int x;
	private ClassB classBObj;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public ClassB getClassBObj() {
		return classBObj;
	}

	public void setClassBObj(ClassB classBObj) {
		this.classBObj = classBObj;
	}

	public ClassA() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ClassA [x=" + x + ", classBObj=" + classBObj + "]";
	}

}
