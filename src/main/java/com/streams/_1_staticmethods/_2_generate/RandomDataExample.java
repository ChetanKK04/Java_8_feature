package com.streams._1_staticmethods._2_generate;

import java.util.Random;
import java.util.stream.Stream;

public class RandomDataExample {
    public static void main(String[] args) {
        Random random = new Random();

        Stream<Integer> randomNumbers = Stream.generate(() -> random.nextInt(100));

        randomNumbers
                .limit(10) // Generate 10 random integers
                .forEach(System.out::println); // Print the random numbers
    }
}