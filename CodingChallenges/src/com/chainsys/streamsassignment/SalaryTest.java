package com.chainsys.streamsassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class SalaryTest {
	public static void main(String[] args) {
		
		  List<SalaryTemp> employeeSalary = new ArrayList<>();
		  employeeSalary.add(new SalaryTemp("Radha", 50000));
		  employeeSalary.add(new SalaryTemp("Divya", 60000));
		  employeeSalary.add(new SalaryTemp("Abi", 55000));
		  employeeSalary.add(new SalaryTemp("Pradhi", 70000));
	        
	        
	        OptionalDouble averageSalary = employeeSalary.stream()
	            .mapToDouble(SalaryTemp::getSalary)  
	            .average(); 
	        System.out.println(averageSalary.isPresent() ? String.format("%.2f", averageSalary.getAsDouble())  : "No salary found");
		
	        
	        
	        
			boolean flagEnabled = true;
			double flagSalary = 70000;

			OptionalDouble averageSalary1 = employeeSalary.stream()
					.filter(emp -> !flagEnabled || emp.getSalary() > flagSalary).mapToDouble(SalaryTemp::getSalary)
					.average();

			System.out.println(
					averageSalary1.isPresent() ? String.format("Average salary: %.2f", averageSalary1.getAsDouble())
							: "No salaries found");
		
	}
	
	
}
