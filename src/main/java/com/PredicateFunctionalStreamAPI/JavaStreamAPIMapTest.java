package com.PredicateFunctionalStreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class JavaStreamAPIMapTest {

	public static void main(String[] args) {
		
		List<Student> ls = new ArrayList<Student>();
		ls.add(new Student("Raj", Subject.Biology, 75));
		ls.add(new Student("Raj", Subject.English, 77));
		ls.add(new Student("Raj", Subject.Maths, 35));
		
		ls.add(new Student("Chetan", Subject.English, 88));
		ls.add(new Student("Chetan", Subject.Maths, 77));
		
		ls.add(new Student("Darshana", Subject.Maths, 95));
		ls.add(new Student("Darshana", Subject.English, 77));
		ls.add(new Student("Darshana", Subject.Biology, 88));
		ls.add(new Student("Darshana", Subject.Sinces, 91));
		
		ls.add(new Student("Prakash", Subject.Maths, 55));
		ls.add(new Student("Prakash", Subject.Biology, 84));
		ls.add(new Student("Prakash", Subject.Sinces, 41));
		ls.add(new Student("Prakash", Subject.English, 77));
		
		HashMap<String	,List<Subject>> map= new HashMap();
		
		  ls.stream().forEach(stu -> { map.computeIfAbsent(stu.getName(), x -> new ArrayList<Subject>()).add(stu.getSubject());
			  });
		  System.out.println(map);
	}

}
