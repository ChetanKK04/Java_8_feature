package com.PredicateFunctionalStreamAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapmethodTest3 {
	
	public static void main(String[] args) {
		
		
		List<Map<String,Integer>> ls = new ArrayList();
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("one", 7);
		map.put("Two", 9);
		
		Map<String, Integer> map2 = new LinkedHashMap<String, Integer>();
		map.put("eight", 8);
		map.put("five", 4);
		
		ls.add(map);
		ls.add(map2);
		
		
		List ll =ls.stream().map(Map :: values).flatMap(Collection :: stream ).collect(Collectors.toList());
		System.out.println(ll);
		
		
	}

}
