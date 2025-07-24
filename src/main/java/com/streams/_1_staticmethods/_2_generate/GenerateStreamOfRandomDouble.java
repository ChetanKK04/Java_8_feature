package com.streams._1_staticmethods._2_generate;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateStreamOfRandomDouble {

    public static void main(String[] args) {

        Stream.generate(new Random()::nextDouble).limit(6).
                forEach(System.out::println);
    }
}
