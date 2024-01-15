package com.example.Core.Java.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinElement {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(33,43,23,11,57);

        List<Integer> minimumNumber = numberList.stream().min(Integer::compareTo).stream().toList();

        System.out.println(minimumNumber);
    }
}
