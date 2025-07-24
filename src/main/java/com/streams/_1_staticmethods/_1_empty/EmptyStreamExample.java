package com.streams._1_staticmethods._1_empty;

import java.util.stream.Stream;

public class EmptyStreamExample {
    public static void main(String[] args) {

        Stream<String> emptystream = Stream.empty();
        long l =emptystream.count();
        System.out.println(l);

        emptystream = Stream.empty();
        String firsElementOfStream =emptystream.findFirst().orElse("Defualt");
        System.out.println(firsElementOfStream);

    }
}
