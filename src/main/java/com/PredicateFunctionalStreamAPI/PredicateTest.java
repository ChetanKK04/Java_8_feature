package com.PredicateFunctionalStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Car{
	
	
	private String name;
	private String colour;
	private int price;
		
}
public class PredicateTest {
	
	
	public static void main(String[] args) {
		
		List<Car> carlist = Arrays.asList(new Car("Kia","Yellow",260000),
									 new Car("Maruti","Red",5000000),
									 new Car("Tata","Black",160000),
									 new Car("Neno","Blue",20000),
									 new Car("MG","Black",60000));
		
		//Predicate<Car> preCar = x -> x.getPrice() > 100000;
		Predicate<Car> preCar = x -> x.getColour().contains("e");
		for (Car car : carlist) {
			if (preCar.test(car))
				System.out.println(car.getName());	
		}
		
	List<Car>	list = carlist.stream().filter(z -> z.getName().contains("M")).collect(Collectors.toList());
	list.forEach(a-> System.out.println(a));
			
	}

}
