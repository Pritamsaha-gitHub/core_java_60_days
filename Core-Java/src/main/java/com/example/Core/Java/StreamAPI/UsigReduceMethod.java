package com.example.Core.Java.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsigReduceMethod {
    public static void main(String[] args) {
        List <Integer> numberList = Arrays.asList(23,35);

        int ans = numberList.stream().reduce(Integer :: sum).get();
        System.out.println(ans);
    }
}
