package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class StringListToUpperCase {
    public static void main(String[] args) {
        List <String> nameList = Arrays.asList("avhvj","pritam","SAhA","poSSDDfg");

        List <String> uppercaselist = nameList.isEmpty() ? null : nameList.stream().map(name -> name.toUpperCase()).toList();

        System.out.println(uppercaselist);
    }
}
