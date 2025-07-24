package com.streams._1_staticmethods._1_empty;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConditionalStreamExample {
    public static void main(String[] args) {

        boolean condition =false;

       Stream<String> stream= condition ? Stream.of("apple",
               "banana","orange") : Stream.empty();

        System.out.println(stream.collect(Collectors.toList()));
    }
}
