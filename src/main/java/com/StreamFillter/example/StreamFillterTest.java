package com.StreamFillter.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Product{  
	int id;  
    String name;  
    float price;  
}

public class StreamFillterTest {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
   List<Float> lf=    productsList.stream().filter(x -> x.price >10000).map(x -> x.price).collect(Collectors.toList());
        System.out.println(lf);
        
        double totalPrice3 = productsList.stream()  
                .collect(Collectors.summingDouble(product->product.price));  
System.out.println(totalPrice3);  
	}

}
