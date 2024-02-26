package com.method_reference_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class Java8ForEachConstroctorRef {

	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("chetan","Raj","Mohit");
		List<Student> Sname =name.stream().map(Student:: new).collect(Collectors.toList()); // via constructor ref
		
		List<Student> Sname1 =name.stream().map((x)-> new Student(x)).collect(Collectors.toList()); // via lambda 
		
		Sname.forEach((xy-> System.out.println(xy)));
		
		
	}

}
