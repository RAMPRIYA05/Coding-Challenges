package com.chainsys.streamsassignment;

import java.util.List;

public class StudentTemp {
	public String name;
	public Address address;
	public List<MobileNumber> mobileNumbers;

	public StudentTemp(String name, Address address, List<MobileNumber> mobileNumbers) {
		super();
		this.name = name;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}

}

class Student {
	private String name;
	private Address address;
	private List<MobileNumber> mobileNumbers;

	public Student(String name, Address address, List<MobileNumber> mobileNumbers) {
		this.name = name;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public List<MobileNumber> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", mobileNumbers=" + mobileNumbers + "]";
	}

}

class Address {
	private String zipcode;

	public Address(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}

class MobileNumber {
	private String number;

	public MobileNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
