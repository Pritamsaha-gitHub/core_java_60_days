package com.example.Core.Java.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindAnyMatch {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("abc","Name","na","New");
        boolean ans = nameList.stream().anyMatch(name -> name.equals("abc"));
        System.out.println(ans);

    }
}
