package com.chainsys.streamsassignment;
public class TempStudent {
	public String name;
	public Address1 address;

	public TempStudent(String name, Address1 address) {
		super();
		this.name = name;
		this.address = address;
	}

}

class Student1 {
	private String name;
	private Address1 address;

	public Student1(String name, Address1 address) {
		this.name = name;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", address=" + address + "]";
	}

}

class Address1 {
	private String zipcode;

	public Address1(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
