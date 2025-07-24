package com.streams._2_Intermediatemethods._1_distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctElementsOfListString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Geeks", "for", "Geeks","GeeksQuiz", "for");
        list.stream().distinct().forEach(System.out::println);
    }
}
