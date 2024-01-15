package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfIntegertoString {

    public static void main(String[] args) {
        List <Integer> numberList = Arrays.asList(12,11,23,34,21,57);

        List<String> StringList = numberList.stream().map(number -> number.toString()).collect(Collectors.toList());

        System.out.println(StringList);
    }
}
