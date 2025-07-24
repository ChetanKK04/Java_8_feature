package com.streams._1_staticmethods._2_generate;
import java.util.stream.Stream;

class Product {
    private static int idCounter = 1;
    private final int id;
    private final String name;

    public Product() {
        this.id = idCounter++;
        this.name = "Product-" + id;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "'}";
    }
}

public class CustomObjectExample {
    public static void main(String[] args) {
        Stream<Product> productStream = Stream.generate(Product::new);

        productStream
                .limit(3) // Generate 3 products
                .forEach(System.out::println); // Print the Product objects
    }
}