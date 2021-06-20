package org.spring.core.app.autowired;

public class Employee {

	private Address address;

	public Employee() {
		super();
		System.out.println("Employee.Employee()");
	}

	
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Employee.Employee().constructor");
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
