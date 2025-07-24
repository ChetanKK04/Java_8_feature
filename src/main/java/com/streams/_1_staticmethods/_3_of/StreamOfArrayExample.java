package com.streams._1_staticmethods._3_of;
import java.util.stream.Stream;

public class StreamOfArrayExample {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        // Create a stream from an array
        Stream<Integer> stream = Stream.of(numbers);

        // Print the elements of the stream
        stream.forEach(System.out::println);
    }
}
