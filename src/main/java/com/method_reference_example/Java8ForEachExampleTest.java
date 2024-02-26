package com.method_reference_example;

import java.util.ArrayList;
import java.util.List;

public class Java8ForEachExampleTest {
	
	private void print(int i) {

System.out.println(i);

	}
	
	private static void printS(int i) {

		System.out.println(i);

			}
	
	public static void main(String[] args) {
		
		Java8ForEachExampleTest name = new Java8ForEachExampleTest();
		// creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 1; i <= 3; i++)
			myList.add(i);
		System.out.println(myList);
		
		myList.forEach(name::print);
		myList.forEach(Java8ForEachExampleTest::printS);
	}
	
	
	 

}
