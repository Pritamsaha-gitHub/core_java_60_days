package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOfASpecificElement {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(12,11,12,12,34,57,22);
        Long countNumber = numberList.stream().filter(number -> number ==12).collect(Collectors.toList()).stream().count();

        System.out.println(countNumber);
    }
}
