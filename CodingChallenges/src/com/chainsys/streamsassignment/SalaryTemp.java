package com.chainsys.streamsassignment;

public class SalaryTemp {
	public String name;
	public double salary;

	public SalaryTemp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalaryTemp [name=" + name + ", salary=" + salary + "]";
	}

}
