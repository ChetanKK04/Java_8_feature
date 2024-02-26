package com.PredicateFunctionalStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamFilterTest {
	
	
	public static void main(String[] args) {
		
		List<Car> carlist = Arrays.asList(new Car("Kia","Yellow",260000),
				 new Car("Maruti","Red",5000000),
				 new Car("Tata","Black",160000),
				 new Car("Neno","Blue",20000),
				 new Car("MG","Black",60000));
		
		
	List<Car> listmb	= carlist.stream().filter(x -> x.getName().contains("M") && x.getColour().contains("B") 
			&& x.getPrice()> 10000).
			
			collect(Collectors.toList()); 
	listmb.forEach(System.out:: println);
	
	Stream.of("chetan","Raj","Prakash").filter(x-> x.contains("h"))
	.map(String :: toUpperCase).forEach(System.out :: println);  // filter and do the opersation  via map  
	
	System.out.println(Arrays.asList("chetan","Raj","Prakash","Chetan").stream().filter(x-> x.contains("h"))
	.map(String :: toUpperCase).collect(Collectors.toList()));  // duplicate are coming because toList()
	
	System.out.println(Arrays.asList("chetan","Raj","Prakash","Chetan").stream().filter(x-> x.contains("h"))
			.map(String :: toUpperCase).collect(Collectors.toSet()));  // duplicate are removed because toSet()
	
		
	}

}
