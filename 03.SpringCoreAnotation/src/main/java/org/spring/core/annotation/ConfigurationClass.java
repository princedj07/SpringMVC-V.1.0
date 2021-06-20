package org.spring.core.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.spring.core.annotation")
@PropertySource("classpath:company-info")
public class ConfigurationClass {

//	@Bean
//	public SoftwareEngineer engineer() {
//		return new SoftwareEngineer();
//	}
//	
//	@Bean
//	public Company company() {
//		Company company = new Company();
//		company.setEngineer(engineer());
//		return company;
//	}
	
}
