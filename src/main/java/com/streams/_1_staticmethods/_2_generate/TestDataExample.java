package com.streams._1_staticmethods._2_generate;
import java.util.Random;
import java.util.stream.Stream;

public class TestDataExample {
    public static void main(String[] args) {
        Random random = new Random();

        Stream<String> testData = Stream.generate(() -> {
            int number = random.nextInt(50) + 1;
            return "Data-" + number;
        });

        testData
                .limit(5) // Generate 5 test data strings
                .forEach(System.out::println);
    }
}