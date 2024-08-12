package com.chainsys.streamsassignment;

public class EmployeeTemp {
	public String name;
	public String jobTitle;

	public EmployeeTemp(String name, String jobTitle) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "EmployeeTemp [name=" + name + ", jobTitle=" + jobTitle + "]";
	}

}
