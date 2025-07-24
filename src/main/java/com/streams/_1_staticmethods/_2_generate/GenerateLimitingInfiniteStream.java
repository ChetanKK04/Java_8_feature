package com.streams._1_staticmethods._2_generate;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateLimitingInfiniteStream {
    public static void main(String[] args) {

        Stream.generate(()->1).limit(5).forEach(System.out::println);
    }
}
