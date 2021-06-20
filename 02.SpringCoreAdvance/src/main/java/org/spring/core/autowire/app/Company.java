package org.spring.core.autowire.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {

	@Autowired
	@Qualifier(value = "dept1")
//	HRDepartment dept;
	CommonDepartment dept;
	
//	public Company() {
//		super();
//		System.out.println("Company.Company()***********");
//	}
//
//	//	@Autowired
//	public Company(HRDepartment dept) {
//		super();
//		this.dept = dept;
//		System.out.println("Company Constructor");
//	}
//	
//	@Autowired
//	public void setDept(@Qualifier(value = "dept2") HRDepartment dept) {
//		this.dept = dept;
//		System.out.println("Company.setDept()");
//	}



	public void companyWork() {
		if(dept == null)
			System.out.println("No Client No Work!!!!");
		else
			dept.work();
	}
	
}
