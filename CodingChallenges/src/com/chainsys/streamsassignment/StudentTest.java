package com.chainsys.streamsassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {

	public static void main(String[] args) {
		List<TempStudent> tempStudents = new ArrayList<>();

		tempStudents.add(new TempStudent("Ram", new Address1("45281")));
		tempStudents.add(new TempStudent("Pradhi", new Address1("94392")));
		tempStudents.add(new TempStudent("Ridhi", new Address1("20173")));
		
//		Create a List<Student> from the List<TempStudent>

		List<Student1> students = tempStudents.stream().map(temp -> new Student1(temp.name, temp.address))
				.collect(Collectors.toList());
		students.forEach(System.out::println);

		//Convert List<Student> to List<String> of student name
		List<String> studentName = students.stream().map(Student1::getName).collect(Collectors.toList());
		studentName.forEach(System.out::println);

		//Convert List<students> to String
		String studentName1 = students.stream().map(Student1::getName).collect(Collectors.joining(", "));
		System.out.println(studentName1);

		//Change the case of List<String>
		List<String> name = studentName.stream().map(String::toUpperCase).collect(Collectors.toList());
		name.forEach(System.out::println);

		//Sort List<String>
		Collections.sort(studentName);
		studentName.forEach(System.out::println);

	}

}
