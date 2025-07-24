package com.streams._2_Intermediatemethods._1_distinct;

import java.util.stream.Stream;

public class DistinctWithOtherOperationsExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "apple", "cherry", "banana");

        // Filter elements starting with 'a', remove duplicates, and convert to uppercase
        Stream<String> processedStream = stream.filter(s -> s.startsWith("a"))
                .distinct()
                .map(String::toUpperCase);

        // Print the processed elements
        processedStream.forEach(System.out::println);
    }
}