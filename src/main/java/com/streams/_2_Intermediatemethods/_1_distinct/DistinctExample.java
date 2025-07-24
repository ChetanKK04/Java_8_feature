package com.streams._2_Intermediatemethods._1_distinct;
import java.util.stream.Stream;

public class DistinctExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "apple", "cherry", "banana");

        // Use distinct() to remove duplicates
        Stream<String> distinctStream = stream.distinct();

        // Print the distinct elements
        distinctStream.forEach(System.out::println);
    }
}
