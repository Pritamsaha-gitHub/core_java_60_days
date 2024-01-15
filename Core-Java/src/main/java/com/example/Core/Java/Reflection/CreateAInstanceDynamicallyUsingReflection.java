package com.example.Core.Java.Reflection;

import com.example.Core.Java.StreamAPIQuestions.ModelClasses.Person;

import java.lang.reflect.Constructor;

public class CreateAInstanceDynamicallyUsingReflection {

    public static void main(String[] args) throws Exception{


        Person person1 = Person.class.newInstance();

        System.out.println(person1.getClass().getName());
    }
}
