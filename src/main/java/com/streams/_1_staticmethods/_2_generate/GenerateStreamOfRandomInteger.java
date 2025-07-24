package com.streams._1_staticmethods._2_generate;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateStreamOfRandomInteger {

    public static void main(String[] args) {

        Stream.generate(new Random()::nextInt).limit(6).
                forEach(System.out::println);
    }
}
