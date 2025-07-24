package com.streams._1_staticmethods._2_generate;

import java.util.stream.Stream;

public class GenerateLimitingInfiniteStreamString {
    public static void main(String[] args) {

        Stream.generate(()->"chetan").limit(3).forEach(System.out::println);
    }
}
