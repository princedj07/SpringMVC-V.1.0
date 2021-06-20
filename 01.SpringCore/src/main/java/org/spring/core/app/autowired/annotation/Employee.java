package org.spring.core.app.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier(value = "temp2")
	private Address address;

	public Employee() {
		super();
		System.out.println("Employee.Employee()");
	}


//	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Employee.Employee().constructor");
	}


	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Employee.setAddress()");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
