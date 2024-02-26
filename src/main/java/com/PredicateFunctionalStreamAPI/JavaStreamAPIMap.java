 package com.PredicateFunctionalStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Student {

	private String name;
	private Subject subject;
	private double marks;
}

enum Subject {
	English, Maths, Sinces, Biology;
}

public class JavaStreamAPIMap {

	public static void main(String[] args) {
		
		List<Student> ls = new ArrayList<Student>();
		ls.add(new Student("Raj", Subject.Biology, 75));
		ls.add(new Student("Chetan", Subject.English, 88));
		ls.add(new Student("Darshana", Subject.Maths, 95));
		ls.add(new Student("Pralash", Subject.English, 77));
		
		Map<String, Subject> ll =  ls.stream().collect(Collectors.toMap(Student :: getName, Student :: getSubject));
		System.out.println(ll);
	}

}
