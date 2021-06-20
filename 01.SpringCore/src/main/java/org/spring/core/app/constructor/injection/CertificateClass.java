package org.spring.core.app.constructor.injection;

public class CertificateClass {

	String name;

	public CertificateClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CertificateClass(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	
}
