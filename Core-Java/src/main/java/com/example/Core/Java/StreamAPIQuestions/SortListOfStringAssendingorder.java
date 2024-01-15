package com.example.Core.Java.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class SortListOfStringAssendingorder {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Abgva","aaa","bbb","aba","xyx");

        List<String> filterNameList = nameList.stream().sorted().toList();

        System.out.println(filterNameList);
    }
}
