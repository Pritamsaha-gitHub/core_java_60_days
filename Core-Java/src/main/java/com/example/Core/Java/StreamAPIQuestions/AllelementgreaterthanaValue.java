package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class AllelementgreaterthanaValue {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(11,12,33,45,56);
        int div = 15;
        List<Integer> ansList = numberList.stream().filter(number->number > div).toList();

        System.out.println((ansList));
    }
}
