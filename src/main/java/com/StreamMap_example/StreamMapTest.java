package com.StreamMap_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapTest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

		System.out.println(list.stream().map(x -> x * 2).collect(Collectors.toList()));

		List<String> list1 = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");

		System.out.println(list1.stream().map(String::toUpperCase).collect(Collectors.toList()));

		List<String> list2 = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", "Computer", "Science", "gfg");

		list2.stream().map(String::length).forEach(System.out::println);
	}

}
