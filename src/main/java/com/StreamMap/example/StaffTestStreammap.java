package com.StreamMap.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
@Setter
class Staff {
	private String name;
    private int age;
    private int salary;
}

public class StaffTestStreammap {
	
	public static void main(String[] args) {
		
		List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, 10000),
                new Staff("jack", 27, 20000),
                new Staff("lawrence", 33, 30000)
        );
		
		System.out.println(staff.stream().map(Staff :: getName).collect(Collectors.toList()));
		
		System.out.println(staff.stream().map(Staff :: getSalary).collect(Collectors.toList()));
		
		System.out.println(staff.stream().filter(x -> x.getSalary()  > 19999).collect(Collectors.toList()));
		
	}

}
