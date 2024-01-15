package com.example.Core.Java.Generics;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class ImplementGenericStack {


    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        List<String> stringList = Arrays.asList("ad","sfd","sdf","afssf","tgbh");
        stackadd(intList);
        stackadd(stringList);
    }
    public static <T>void stackadd (List<T> dataList) {
        Stack<T> stack =new Stack<>();
        for(T ele : dataList) {
            stack.push(ele);
        }
        T popele = stack.pop();
        System.out.println(popele);
    }
}


