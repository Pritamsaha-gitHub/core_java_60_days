package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class FindMinimumValueOfDoubleList {
    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(12.5,13.7,9.6,10.1,11.6);

        double minimumvalue = doubleList.stream().min(Double ::compareTo).get();

        System.out.println(minimumvalue);
    }
}
