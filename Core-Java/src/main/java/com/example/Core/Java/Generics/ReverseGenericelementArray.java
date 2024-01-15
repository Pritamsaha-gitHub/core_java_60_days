package com.example.Core.Java.Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseGenericelementArray {

    public static void main(String[] args) {
        String[] nameList = {"vhsjh","jshdb"};
        Integer[] numberList = {1,2,3,4};

        System.out.println(reverseArray(nameList).toString());
        System.out.println(reverseArray(numberList).toString());
    }

    public static  <T>T[] reverseArray (T[]dataArray) {
       Collections.reverse(Arrays.asList(dataArray));

       return dataArray;
    }
}
