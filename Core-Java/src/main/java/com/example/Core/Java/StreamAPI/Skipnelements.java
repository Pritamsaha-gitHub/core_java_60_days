package com.example.Core.Java.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skipnelements {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Pritam","Dipankar","Aniruddha","Sivam","Ajay");

        List<String> toppers = nameList.isEmpty() ? null : nameList.stream().skip(2).collect(Collectors.toList());

        System.out.println(toppers);
    }
}
