package com.example.Core.Java.Generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaximumElement {

    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(12.1,15.7,9.2);
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        List<String> stringList = Arrays.asList("abs","jhjhbvg","oiu","wsx");
        findMax(stringList);
        findMax(intList);
        findMax(doubleList);
    }

    public static void findMax(List<?> dataList) {
        System.out.println(dataList.stream().sorted().collect(Collectors.toList()).get(dataList.size()-1));
    }

}
