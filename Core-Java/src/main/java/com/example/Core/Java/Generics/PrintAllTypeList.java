package com.example.Core.Java.Generics;

import java.util.Arrays;
import java.util.List;

public class PrintAllTypeList <T>{

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("vhsjh","jshdb");
        List<Integer> numberList = Arrays.asList(1,2,3,4);

        PrintAllTypeList(nameList);
        PrintAllTypeList(numberList);
    }
    public static void PrintAllTypeList(List<?> printList) {

        System.out.println(printList);

    }
}
