package com.chainsys.streamstrial;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {
  public static void main(String[] args) {
	  StudentDetails student1=new StudentDetails("Rampriya",22,new Address("3456"),Arrays.asList(new MobileNumber("7896"),new MobileNumber("7897")));
      StudentDetails student2=new StudentDetails("Priya",21,new Address("4567"),Arrays.asList(new MobileNumber("3456"),new MobileNumber("8879")));
	  StudentDetails student3=new StudentDetails("Akalya",25,new Address("7363"),Arrays.asList(new MobileNumber("4567"),new MobileNumber("7897")));
	  
	  List<StudentDetails> students=Arrays.asList(student1,student2,student3);
	  
	  
	  Optional<StudentDetails> student=students.stream().filter(studentDetails->studentDetails.getName().equals("Priya")).findFirst();
	  System.out.println(student.isPresent()?student.get().getName():"No student found");
  
  Optional<StudentDetails> stud1=students.stream().filter(studentDetails->studentDetails.getAddress().getZipcode().equals("7363")).findFirst();
  System.out.println(stud1.isPresent()?stud1.get().getName():"No student found");
  
  List<StudentDetails> stud2=students.stream().filter(studentDetails1->studentDetails1.getMobileNumber().stream().anyMatch(x->Objects.equals(x.getNumber(),"7897"))).collect(Collectors.toList());
  String result1=stud2.stream().map(stu->stu.getName()).collect(Collectors.joining(","));
  System.out.println(result1);
  
  List<StudentDetails> stud3=students.stream().filter(studentDetails11->studentDetails11.getMobileNumber().stream().allMatch(x->Objects.equals(x.getNumber(),"7897")|| Objects.equals(x.getNumber(), "4567"))).collect(Collectors.toList());
  String result2=stud3.stream().map(stu1->stu1.getName()).collect(Collectors.joining(","));
  System.out.println(result2);
  
  List<StudentDetails> stud4=students.stream().filter(studentDetails11->studentDetails11.getMobileNumber().stream().noneMatch(x->Objects.equals(x.getNumber(),"7896")|| Objects.equals(x.getNumber(), "7897"))).collect(Collectors.toList());
  String result3=stud4.stream().map(stu11->stu11.getName()).collect(Collectors.joining(","));
  System.out.println(result3);
  
  List<String> nameList=Arrays.asList("Ram","Siya","Kiara","Meera");
  nameList.stream().map(String::toUpperCase).forEach(System.out::println);
}
}