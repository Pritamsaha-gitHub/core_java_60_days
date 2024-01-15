package com.example.Core.Java.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWithMap {

    public static void main(String[] args) {
        List <String> nameList = Arrays.asList("CGBsd","dfghjk","AKDDUD","nbjbAER");

//        List<String> filteredNameList = nameList.size() > 0 ? nameList.stream().map(name ->name.toUpperCase()).toList() : null;
        List<String> filteredNameList = nameList.size() > 0 ? nameList.stream().map(name->name.toUpperCase()).collect(Collectors.toList()) : null;
        System.out.println(filteredNameList);
    }
}
