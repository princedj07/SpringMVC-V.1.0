package org.spring.core.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HardwareEngineer implements Engineer {

	@Override
	public void development() {
		System.out.println("HardwareEngineer.development()");
	}

}
