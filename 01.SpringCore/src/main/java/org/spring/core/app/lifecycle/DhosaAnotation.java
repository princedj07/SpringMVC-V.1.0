package org.spring.core.app.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DhosaAnotation {

	private String subject;

	
	
	public DhosaAnotation() {
		super();
		System.out.println("super constructor calles....");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "DhosaAnotation [subject=" + subject + "]";
	}
	
	
	@PostConstruct
	public void start() {
		System.out.println("start method");
	}

	@PreDestroy
	public void end() {
		System.out.println("DhosaAnotation.end()");
	}
		
}
