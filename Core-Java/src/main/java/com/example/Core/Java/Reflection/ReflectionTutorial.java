package com.example.Core.Java.Reflection;

import com.example.Core.Java.Reflection.Models.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTutorial {
    public static void main(String[] args) throws Exception{



        Cat cat = new Cat("catName",3);
//        System.out.println(cat.getName() + " "+ cat.getAge());

        Field [] catFields = cat.getClass().getDeclaredFields();

        for (Field field : catFields) {
//            System.out.println(field.getName());
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(cat,"newCatName");
            }
        }

        Method [] catMethods = cat.getClass().getDeclaredMethods();

        for (Method method : catMethods) {
//            System.out.println(method.getName());
            if (method.getName().equals("publicMethod")) {
                method.invoke(cat);
                //If any parameter is there in that function we can pass like that method.invoke(cat,function);
            }
            if (method.getName().equals("privateMethod")) {
                method.setAccessible(true);
                method.invoke(cat);
            }
            if (method.getName().equals("publicStaticMethod")) {
                method.setAccessible(true);
                method.invoke(cat);
            }
            if (method.getName().equals("privateStaticMethod")) {
                method.setAccessible(true);
                method.invoke(cat);
            }
        }

//        System.out.println(cat.getName());
    }
}
