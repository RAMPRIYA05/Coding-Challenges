package com.chainsys.streamsassignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		List<EmployeeTemp> employees = Arrays.asList(new EmployeeTemp("Ram", "Trainee"),
				new EmployeeTemp("Priya", "Tester"), new EmployeeTemp("Rampriya", "Trainee"),
				new EmployeeTemp("Siya", "Business Analyst"), new EmployeeTemp("Riya", "Manager"));

		Map<String, List<EmployeeTemp>> job = employees.stream()
				.collect(Collectors.groupingBy(EmployeeTemp::getJobTitle));

		job.forEach((jobTitle, empList) -> System.out.println(jobTitle + ": " + empList));

	}

}
