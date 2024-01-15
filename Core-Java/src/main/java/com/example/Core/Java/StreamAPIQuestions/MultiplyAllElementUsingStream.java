package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class MultiplyAllElementUsingStream {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5);
        int multiply = numberList.stream().reduce(1,(a,b)->a*b);

        System.out.println(multiply);
    }
}
