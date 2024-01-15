package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class AvarageofListDoublesNumbers {

    public static void main(String[] args) {
        List <Double> numberList = Arrays.asList(12.3,17.8,33.4,23.1,17.1);

        Double avgNum = numberList.stream().reduce(Double ::sum).get() / numberList.size();

        System.out.println(avgNum);
    }
}
