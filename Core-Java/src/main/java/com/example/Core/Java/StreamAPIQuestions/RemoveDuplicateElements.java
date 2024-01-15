package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List <Integer> numberList = Arrays.asList(1,2,34,22,11,1,37,15,3,3);

        List<Integer> uniqueList = numberList.stream().collect(Collectors.toSet()).stream().toList();

        System.out.println(uniqueList);
    }
}
