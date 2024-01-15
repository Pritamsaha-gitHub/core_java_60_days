package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class SumOflistelements {

    public static void main(String[] args) {
        List<Integer> numberlist = Arrays.asList(12,35,77,11);

        int total = numberlist.stream().reduce(Integer :: sum).get();

        System.out.println(total);
    }
}
