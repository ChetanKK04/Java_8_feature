package com.forEach_method_example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

	private String name;
	private int age;

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

	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

public class SortTheListByName {
	
	public static void main(String[] args) {
		
		List<Student> myList = Arrays.asList(new Student("babu",32),
				new Student("chetan",30),
				new Student("amit",31),
				new Student("darshana",23),
				new Student("ishita",39));
		
		// 1 way to compare
		Comparator<Student> copname = ( s1,  s2) -> s1.getName().compareTo(s2.getName());
		Collections.sort(myList, copname);
		System.out.println(myList);
		
		// 2 way to compare
		Collections.sort(myList, ( s1,  s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println(myList);
		
		// 3 way to compare
		Collections.sort(myList, Comparator.comparing(Student::getAge));
		System.out.println(myList);
		
		// 4 way to compare in reverse by age 
				Collections.sort(myList, Comparator.comparing(Student::getAge).reversed());
				System.out.println(myList);
				
				// 5 way to compare in reverse by name 
				
				Collections.sort(myList, Comparator.comparing(Student::getName).reversed());
				System.out.println(myList);
	}
	

}
