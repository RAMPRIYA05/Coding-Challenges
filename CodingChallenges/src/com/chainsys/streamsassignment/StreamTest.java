package com.chainsys.streamsassignment;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;










public class StreamTest {

	public static void main(String[] args) {
		
		 int[] numbers = {2, 3, 5, 7, 8};
	        Stream<int[]> stream = Arrays.stream(new int[][]{numbers});
	        stream.forEach(array -> {
	            for (int number : array) {
	                System.out.println(number);
	            }
	        });
		
//	        Write a method to get a Streams from an existing array.
		
		
		Student student1 = new Student(
	            "Reema",
	            new Address("983"),
	            Arrays.asList(new MobileNumber("9820"), new MobileNumber("9940")));
	 
	        Student student2 = new Student(
	            "Priya",
	            new Address("201/78"),
	            Arrays.asList(new MobileNumber("9940"), new MobileNumber("7638"), new MobileNumber("1233")));
	 
	        Student student3 = new Student(
	            "Ram",
	            new Address("403/36"),
	            Arrays.asList(new MobileNumber("8934"), new MobileNumber("9940")));
	 
	        List<Student> students = Arrays.asList(student1, student2, student3);
	        
//	        Get student with exact match name "Reema"
	        
	        Optional<Student> stud = students.stream()
	                .filter(student -> student.getName().equals("Reema"))
	                .findFirst();
	            System.out.println(stud.isPresent() ? stud.get().getName() : "No student found");
	            System.out.println("--------------------");
	        
	        
//	            Get student with matching address "201/78"
	            
	            Optional<Student> stud1 = students.stream()       		
	                    
	                    .filter(student -> student.getAddress().getZipcode().equals("201/78"))
	                    .findFirst();
	                System.out.println(stud1.isPresent() ? stud1.get().getName() : "No student found");
	                System.out.println("--------------------");
	                
	                
//	                Get all student having mobile numbers 8934.

	                List<Student> stud2 = students.stream()
	                        .filter(student111 -> student111.getMobileNumbers().stream().anyMatch(x -> Objects.equals(x.getNumber(), "8934")))
	                        .collect(Collectors. toList());
	             
	                      String result1 = stud2.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
	                      System.out.println(result1);
	                    System.out.println("--------------------");
	             
	             
//	                    Get all student having mobile number 9820 and 9940
	                    List<Student> stud3 = students.stream()
	                            .filter(student -> student.getMobileNumbers().stream().allMatch(x -> Objects.equals(x.getNumber(), "9820") || Objects.equals(x.getNumber(), "9940")))
	                            .collect(Collectors.toList());
	                 
	                        String result4 = stud3.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
	                        System.out.println(result4);
	                        System.out.println("--------------------");
	                 
	                        
	                       

	}

}
