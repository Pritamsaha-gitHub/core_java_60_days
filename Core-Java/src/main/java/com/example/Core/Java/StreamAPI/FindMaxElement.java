package com.example.Core.Java.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(33,43,23,11,57);

        List<Integer> minimumNumber = numberList.stream().max(Integer::compareTo).stream().toList();

        System.out.println(minimumNumber);
    }
}
