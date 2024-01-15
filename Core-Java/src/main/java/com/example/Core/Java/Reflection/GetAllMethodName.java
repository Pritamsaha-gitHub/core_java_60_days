package com.example.Core.Java.Reflection;

import com.example.Core.Java.Reflection.Models.Cat;

import java.lang.reflect.Method;

public class GetAllMethodName {

    public static void main(String[] args) {
        Cat cat = new Cat("catt",10);

        Method [] methods = cat.getClass().getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
