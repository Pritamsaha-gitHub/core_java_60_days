package com.example.Core.Java.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FilterListStartsWitthA {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("abc","def","ghi","aka","ACC","mno","Stu");
        List <String> filteredList = names.size() > 0 ? names.stream().filter(name->name.toLowerCase().startsWith("a")).toList() : null;
        System.out.println(filteredList);
    }
}
