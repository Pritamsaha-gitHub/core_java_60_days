package com.example.Core.Java.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class UsingToarray {
    public static void main(String[] args) {
        int [] numberArray = {1,2,3,4,5,77,89,2};
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,77,89,2);


//        int [] output = numberList.isEmpty() ? null : numberList.toArray(Integer[] :: new);
        Integer[] output = numberList.isEmpty() ? null : numberList.toArray(Integer[]::new);
        int[] ansArray = Arrays.stream(numberArray).distinct().toArray();
//        System.out.println(ansArray);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
