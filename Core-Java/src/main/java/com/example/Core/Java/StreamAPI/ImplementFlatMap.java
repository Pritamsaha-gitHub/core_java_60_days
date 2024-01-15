package com.example.Core.Java.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImplementFlatMap {
    public static void main(String[] args) {
        List<List<Integer>> numList1 = new ArrayList<>();
        List<Integer> numList2 = Arrays.asList(4,5,6);
        List<Integer> numList3 = Arrays.asList(7,8,9);
        numList1.add(numList2);
        numList1.add(numList3);


        List<Integer> numList = numList1.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(numList);
    }
}
