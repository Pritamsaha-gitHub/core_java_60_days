package com.example.Core.Java.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindAnyMethod {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(21,11,33,15,1,2,23,37,18,51,47);
        System.out.println(numberList.stream().findAny().orElse(-1));
    }
}
