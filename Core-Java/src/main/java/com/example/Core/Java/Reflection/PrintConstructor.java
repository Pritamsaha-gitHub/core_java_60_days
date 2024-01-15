package com.example.Core.Java.Reflection;

import com.example.Core.Java.StreamAPIQuestions.ModelClasses.Person;

public class PrintConstructor {

    public static void main(String[] args) throws Exception{
        Person person1 = new Person("xyz",22);

        System.out.println(person1.getClass().getConstructor());
    }
}
