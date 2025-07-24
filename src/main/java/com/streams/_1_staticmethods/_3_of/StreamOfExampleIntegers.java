package com.streams._1_staticmethods._3_of;

import java.util.stream.Stream;

public class StreamOfExampleIntegers {
    public static void main(String[] args) {
        // Create a stream from individual values
        Stream<Integer> stream = Stream.of(8, 33, 11);

        // Print the elements of the stream
        stream.forEach(System.out::println);
    }
}