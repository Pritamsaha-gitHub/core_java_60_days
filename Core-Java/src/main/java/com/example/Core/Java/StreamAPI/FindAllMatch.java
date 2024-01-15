package com.example.Core.Java.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindAllMatch {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("name","Name","naME","NAme");
        boolean ans = nameList.stream().allMatch(name -> name.toLowerCase().equals("name"));
        System.out.println(ans);
    }
}
