package com.PredicateFunctionalStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapmethodTest {
	
	public static void main(String[] args) {
		
		List<String> ls = Arrays.asList("a","b","t");
		List<String> ls1 = Arrays.asList("k","i","l");
		List<String> ls2 = Arrays.asList("r","y","u");
		
		List <String> lsadd = Stream.of(ls,ls1,ls2).flatMap(List :: stream).collect(Collectors.toList());
		System.out.println(lsadd);
	}

}
