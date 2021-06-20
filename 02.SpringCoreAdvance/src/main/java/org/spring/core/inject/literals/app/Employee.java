package org.spring.core.inject.literals.app;

import org.springframework.beans.factory.annotation.Value;

public class Employee {

	@Value(value = "${emp.name}")
	private String empName;
	
	@Value(value = "${emp.id}")
	private int empId;
	
	@Value(value = "${emp.skill}")
	private String empOtherSkill;

//	@Value(value = "${emp.name}")
	public void setEmpName(String empName) {
		this.empName = empName;
	}

//	@Value(value = "${emp.id}")
	public void setEmpId(int empId) {
		this.empId = empId;
	}

//	@Value(value = "${emp.skill}")
	public void setEmpOtherSkill(String empOtherSkill) {
		this.empOtherSkill = empOtherSkill;
	}

	public void showEmpDetails() {
		System.out.println("EmployeeName-----: "+empName);
		System.out.println("EmployeeId-------: "+empId);
		System.out.println("EmployeeSkill----: "+empOtherSkill);
	}
	
}
