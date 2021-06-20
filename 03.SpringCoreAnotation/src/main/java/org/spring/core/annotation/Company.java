package org.spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {

//	@Autowired
//	SoftwareEngineer engineer;
	
	@Autowired
	@Qualifier(value = "softwareEngineer")
	Engineer engineer;
	
//	@Value(value = "Prince")
	@Value(value = "${com.name}")
	private String name;
	
//	@Autowired
//	public void setEngineer(SoftwareEngineer engineer) {
//		this.engineer = engineer;
//		System.out.println("Company.setEngineer()");
//	}


	public void showDetails() {
		System.out.println("Company.showDetails()");		
		System.out.println("Company.showDetails()----: "+name);
	}

}
