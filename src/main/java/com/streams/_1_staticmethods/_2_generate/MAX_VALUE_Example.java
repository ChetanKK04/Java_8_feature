package com.streams._1_staticmethods._2_generate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MAX_VALUE_Example {
    public static void main(String[] args) {

        List<Integer> numbers = Stream.generate(() -> 5)
                .limit(Integer.MAX_VALUE)
                .collect(Collectors.toList());
        System.out.println(numbers);
    }
}
