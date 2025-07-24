package com.streams._2_Intermediatemethods._1_distinct;

import java.util.stream.Stream;

public class RemoveDuplicateNamesExample {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Alice", "Bob", "Alice", "Charlie", "Bob");

        names.distinct().forEach(name ->System.out.println("Name :" + name));

    }
}