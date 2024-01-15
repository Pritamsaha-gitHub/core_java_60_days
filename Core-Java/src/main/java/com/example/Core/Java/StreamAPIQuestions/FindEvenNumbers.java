package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,5,12,3,9,78,21);

        List<Integer> filteredNumber = numbers.isEmpty() ? null : numbers.stream().filter(number -> number%2==0).toList();
        System.out.println(filteredNumber);
    }
}
