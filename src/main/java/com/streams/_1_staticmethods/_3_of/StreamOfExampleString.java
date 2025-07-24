package com.streams._1_staticmethods._3_of;

import java.util.stream.Stream;

public class StreamOfExampleString {
    public static void main(String[] args) {
        // Create a stream from individual values
        Stream<String> stream = Stream.of("apple", "banana", "cherry");

        // Print the elements of the stream
        stream.forEach(System.out::println);
    }
}