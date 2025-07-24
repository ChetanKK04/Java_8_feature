package com.streams._1_staticmethods._2_generate;

import java.util.UUID;
import java.util.stream.Stream;

public class UniqueIdExample {
    public static void main(String[] args) {
        Stream<String> uniqueIds = Stream.generate(() -> UUID.randomUUID().toString());

        uniqueIds
                .limit(5) // Generate 5 unique IDs
                .forEach(System.out::println); // Print the UUIDs
    }
}