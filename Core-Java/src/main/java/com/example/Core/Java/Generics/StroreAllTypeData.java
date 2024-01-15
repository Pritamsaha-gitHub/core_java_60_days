package com.example.Core.Java.Generics;

import java.util.ArrayList;
import java.util.List;

public class StroreAllTypeData {

    public static void main(String[] args) {
//        List<Object> objectList = new ArrayList<>();
//
//        objectList.add(123);
//        objectList.add("vbn");
        genericClass <Integer> intdata = new genericClass<>(15);
        genericClass <String> stringdata = new genericClass<>("abc");

        intdata.printData();
        stringdata.printData();
    }

}
class genericClass <T> {

    public T dattype;

    public genericClass (T dattype) {
        this.dattype = dattype;
    }
    public void printData() {
        System.out.println(dattype);
    }
}

