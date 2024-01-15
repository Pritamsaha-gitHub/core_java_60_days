package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class ListOfStringToLength {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Pritam","vnb","abc","nana");

        List <Integer> lengthList = nameList.stream().map(name -> name.length()).toList();

        System.out.println(lengthList);
    }
}
