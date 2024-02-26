package com.PredicateFunctionalStreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapmethodTest2 {

	public static void main(String[] args) {

		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		map.put("one", Arrays.asList("a", "b", "t"));
		map.put("Two", Arrays.asList("k", "i", "l"));

		List<String> ls = map.values().stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(ls);

		//List<String> lskey = map.keySet().stream().flatMap(List::stream).collect(Collectors.toList());

	}

}
