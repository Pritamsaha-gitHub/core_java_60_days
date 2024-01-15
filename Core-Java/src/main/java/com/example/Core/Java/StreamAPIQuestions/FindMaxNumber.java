package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumber {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3);

        int num = numberList.stream().max(Integer::compareTo).get();

        System.out.println(num);
    }
}
