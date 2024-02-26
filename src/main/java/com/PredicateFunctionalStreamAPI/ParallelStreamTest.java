package com.PredicateFunctionalStreamAPI;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamTest {

	public static void main(String[] args) {

		List ls = Arrays.asList("d","r","k","l");
		
		ls.parallelStream().forEach(System.out :: println);
	}

}
