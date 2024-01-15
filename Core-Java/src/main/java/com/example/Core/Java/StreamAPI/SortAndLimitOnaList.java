package com.example.Core.Java.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAndLimitOnaList {
    public static void main(String[] args) {
        List<Integer> ageList = Arrays.asList(11,32,23,57,31,44,57);

        List <Integer> filteredList = ageList.isEmpty() ? new ArrayList<>() : ageList.stream().sorted().toList().stream().limit(3).toList();

        System.out.println(filteredList);
    }
}
