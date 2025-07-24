package com.streams._2_Intermediatemethods._1_distinct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctUniqueDataList {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(10));
        personList.add(new Person(10));
        personList.add(new Person(30));
        personList.add(new Person(20));

        personList.stream().distinct().forEach(System.out::println);
    }

}

@Data
@AllArgsConstructor
@ToString
class Person{
    private int id;

}
