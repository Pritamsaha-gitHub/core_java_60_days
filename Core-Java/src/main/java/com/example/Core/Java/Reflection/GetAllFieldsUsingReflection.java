package com.example.Core.Java.Reflection;

import com.example.Core.Java.Reflection.Models.Cat;

import java.lang.reflect.Field;

public class GetAllFieldsUsingReflection {
    public static void main(String[] args) {
        Cat cat = new Cat("catty",7);

        Field [] fields = cat.getClass().getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

}
