package com.example.Core.Java.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterWithDistinct {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,45,67,32,51,1,22,27);
        List<Integer> uniqueList = !numberList.isEmpty()  ? numberList.stream().distinct().toList() : new ArrayList<>();

        System.out.println(uniqueList);
    }
}
