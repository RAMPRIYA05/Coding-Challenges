package com.chainsys.streamstrial;
import java.util.List;

public class StudentData {
   public String name;
    public int age;
    public Address address;
	public List<MobileNumber> mobileNumber;
	public StudentData(String name, int age, Address address, List<MobileNumber> mobileNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	
	
	
}
class StudentDetails{
	 private String name;
	 private int age;
	 private Address address;
	 private List<MobileNumber> mobileNumber;
	public StudentDetails(String name, int age, Address address, List<MobileNumber> mobileNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<MobileNumber> getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(List<MobileNumber> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", age=" + age + ", address=" + address + ", mobileNumber="
				+ mobileNumber + "]";
	}
}

class Address{
	private String zipcode;

	public Address(String zipcode) {
		super();
		this.zipcode = zipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}

class MobileNumber{
	private String number;

	public MobileNumber(String number) {
		super();
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}

