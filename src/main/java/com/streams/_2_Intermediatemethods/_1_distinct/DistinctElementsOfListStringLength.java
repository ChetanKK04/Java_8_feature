package com.streams._2_Intermediatemethods._1_distinct;

import java.util.Arrays;
import java.util.List;

public class DistinctElementsOfListStringLength {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Geeks", "for", "Geeks","GeeksQuiz", "for");
        long l =list.stream().distinct().count();
        System.out.println(l);
    }
}
