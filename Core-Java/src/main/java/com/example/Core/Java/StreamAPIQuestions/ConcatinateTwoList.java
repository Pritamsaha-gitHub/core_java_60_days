package com.example.Core.Java.StreamAPIQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatinateTwoList {
    public static void main(String[] args) {
        List<List<Integer>> numberList = new ArrayList<>();
        List<Integer> numberList1 = Arrays.asList(12,22,34,14);
        List<Integer> numberList2 = Arrays.asList(15,27,33,11);
        numberList.add(numberList1);
        numberList.add(numberList2)
;
        List<Integer> concatList = numberList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(concatList);
    }
}
