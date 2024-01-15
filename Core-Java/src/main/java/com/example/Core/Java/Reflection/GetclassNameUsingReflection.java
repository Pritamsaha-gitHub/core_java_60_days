package com.example.Core.Java.Reflection;

import com.example.Core.Java.Reflection.Models.Cat;

public class GetclassNameUsingReflection {
    public static void main(String[] args) {
        Cat cat = new Cat("cat Name", 2);
        System.out.println(cat.getClass().getName());
    }
}
