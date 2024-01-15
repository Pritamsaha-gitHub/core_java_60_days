package com.example.Core.Java.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindNoneMatch {
    public static void main(String[] args) {
        List<Integer> nameList = Arrays.asList(1,2,3,4,5,6);
        boolean ans = nameList.stream().noneMatch(name -> name.equals(6));
        System.out.println(ans);
    }
}
