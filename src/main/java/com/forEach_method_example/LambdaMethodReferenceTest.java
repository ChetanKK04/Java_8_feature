package com.forEach_method_example;

import java.util.Arrays;
import java.util.List;

public class LambdaMethodReferenceTest {
	   public static void main(String args[]) {
	      List<String> myList = Arrays.asList("INdIA", "AUStRALIA", "ENGLAND", "NEWZEaLAND", "SCOTLAnD");
	      System.out.println("------- Lambda Expression --------");

	      // Using Lambda function to call system.out.println()
	      myList.stream().map(s -> s.toUpperCase())
	                     .forEach(s -> System.out.println(s));

	      System.out.println("------- Method Reference ---------");

	      // Using Method reference to call system.out.println()
	      myList.stream().map(String :: toUpperCase).sorted()
	                     .forEach(System.out :: println);
	   }
	}