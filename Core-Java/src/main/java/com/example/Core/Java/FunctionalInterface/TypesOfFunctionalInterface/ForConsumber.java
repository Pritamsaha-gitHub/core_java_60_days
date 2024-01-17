package com.example.Core.Java.FunctionalInterface.TypesOfFunctionalInterface;

public class ForConsumber {
    public static void main(String[] args) {
        FunctionalInterfaceConsumer Car = (NofWheels) -> {
            System.out.println("Car Having " + NofWheels + " Wheels");
        };
        Car.noOfWheels(4);
    }
}
