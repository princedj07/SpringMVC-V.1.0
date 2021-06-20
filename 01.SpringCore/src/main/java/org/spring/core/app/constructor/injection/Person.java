package org.spring.core.app.constructor.injection;

public class Person {

	private String name;
	private int personId;
	private CertificateClass cert;

	public Person() {
		super();
	}

	public Person(String name, int personId, CertificateClass cert) {
		super();
		this.name = name;
		this.personId = personId;
		this.cert = cert;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId+ "{"+this.cert.name+"}";
	}

}
