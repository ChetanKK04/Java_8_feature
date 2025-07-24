package com.streams._1_staticmethods._2_generate;

import java.util.stream.Stream;

public class ErrorHandlingExample {
    public static void main(String[] args) {
        Stream<String> streamWithErrors = Stream.generate(() -> {
            try {
               double d = Math.random();
                if (d > 0.8) {
                    throw new RuntimeException("Random error occurred");
                }
                return "Valid Data " + d;
            } catch (Exception e) {
                return "Error: " + e.getMessage();
            }
        });

        streamWithErrors
                .limit(6)
                .forEach(System.out::println);
    }
}