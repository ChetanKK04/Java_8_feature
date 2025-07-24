package com.streams._1_staticmethods._2_generate;

import java.util.stream.Stream;

public class GenerateConstantValues {
    public static void main(String[] args) {

        Stream<String> constantStream = Stream.generate(() -> "Constant Value");

        constantStream
                .limit(5) // Restrict to 5 elements
                .forEach(System.out::println); // Prints "Constant Value" 5 times
    }
}
