package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Chetan","Raju","Yaman","Pran");

       List<String> stringList1= stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(stringList1);

    }}
