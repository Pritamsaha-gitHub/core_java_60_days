package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterNullValusFromAList {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("name",null ,"surname",null,null,"abc");

        List<String> filterList = nameList.isEmpty() ? null : nameList.stream().filter(Objects::nonNull).collect(Collectors.toList());

        System.out.println(filterList);
    }
}
