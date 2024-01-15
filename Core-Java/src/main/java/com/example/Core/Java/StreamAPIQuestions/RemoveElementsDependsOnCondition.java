package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class RemoveElementsDependsOnCondition {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(12,17,11,27,24,10);

        List<Integer> ansList = numberList.stream().filter(number -> number >= 12).toList();

        System.out.println(ansList);
    }
}
