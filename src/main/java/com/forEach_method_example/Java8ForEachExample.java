package com.forEach_method_example;

import java.util.ArrayList;
import java.util.List;

public class Java8ForEachExample {
	
	public   void print(int i) {
		System.out.println(i);
			}
	
	public static  void printS(int i) {
		System.out.println(i);
			}
	public static void main(String[] args) {
		
		Java8ForEachExample name = new Java8ForEachExample();
		// creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 1; i <= 3; i++)
			myList.add(i);
		System.out.println(myList);
		
		myList.forEach(list -> System.out.println(list));
		System.out.println("...............");
		myList.forEach(i -> name.print(i));
		System.out.println("...............");
		myList.forEach(i -> Java8ForEachExample.printS(i));
		
		
	}
	
	
	 

}
