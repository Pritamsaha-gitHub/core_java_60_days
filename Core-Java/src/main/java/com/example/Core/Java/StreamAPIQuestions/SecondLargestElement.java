package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestElement {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(12,17,34,20,56);

        int secondLargest = numberList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

        System.out.println(secondLargest);
    }
}
