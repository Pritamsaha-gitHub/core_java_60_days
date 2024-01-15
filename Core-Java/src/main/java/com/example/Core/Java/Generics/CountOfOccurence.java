package com.example.Core.Java.Generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOfOccurence {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("vhsjh","jshdb","abc");
        List<Integer> numberList = Arrays.asList(1,2,3,4,1);

        System.out.println(countOccurence(nameList,"abc"));
        System.out.println(countOccurence(numberList,1));
    }

    public static <T>Long countOccurence(List<T>dataList,T dataName) {
        return dataList.stream().filter(data -> data.equals(dataName)).collect(Collectors.toList()).stream().count();
    }
}
