package com.streams._2_Intermediatemethods._1_distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctElementsOfListInterger {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);

                list.stream().distinct().forEach(System.out::println);
    }
}
