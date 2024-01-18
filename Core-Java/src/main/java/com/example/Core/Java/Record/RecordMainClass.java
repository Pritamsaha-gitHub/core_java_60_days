package com.example.Core.Java.Record;

public class RecordMainClass {
    public static void main(String[] args) {
        PersonRecord personRecord = new PersonRecord("Pritam",28,"Howrah");
        System.out.println(personRecord.toString());

        Point point = new Point(12,15);
        System.out.println("Initial value -> " + point);

        Point transmatepoint = point.translate(3,4);
        System.out.println("After transmate value is -> " + transmatepoint);
    }
}
