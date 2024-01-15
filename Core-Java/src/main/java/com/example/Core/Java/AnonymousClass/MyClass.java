package com.example.Core.Java.AnonymousClass;

public class MyClass {

    public static void main(String[] args) {

        MyName myname =new MyName()
        {
            public void printMyname() {
                System.out.println("My name is Saha");
            }
        };
        myname.printMyname();
    }

}

class MyName {

    public void printMyname() {
        System.out.println("My name is pritam");
    }
}
