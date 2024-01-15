package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstThreeElement {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(12,81,11,33,45,13,99);

        List<Integer> limitList = numberList.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitList);
    }
}
