package com.example.Core.Java.StreamAPIQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverListOfStringIntoAString {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("ABCM","FGH","dcvb","qqq");

        String ans = nameList.stream().collect(Collectors.joining());
        System.out.println(ans);
    }


}
