package com.example.Core.Java.Reflection.Models;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name,int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void publicMethod() {
        System.out.println("This is a Public Method");
    }

    private void privateMethod() {
        System.out.println("This is a private Method");
    }

    public static void publicStaticMethod() {
        System.out.println("This is a public static Method");
    }
    private static void  privateStaticMethod() {
        System.out.println("This is a private Static Method");
    }
}
