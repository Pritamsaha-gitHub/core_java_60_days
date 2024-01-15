package com.example.Core.Java.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindFirstMethod {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(23,33,15,1,2);
        System.out.println(numberList.stream().findFirst());
    }
}
