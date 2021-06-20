package org.spring.core.annotation;

import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer implements Engineer{

	@Override
	public void development() {
		System.out.println("SoftwareEngineer.development()");
	}

	
}
