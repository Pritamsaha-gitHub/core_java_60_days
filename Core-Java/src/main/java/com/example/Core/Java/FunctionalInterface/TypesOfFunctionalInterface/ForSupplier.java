package com.example.Core.Java.FunctionalInterface.TypesOfFunctionalInterface;

public class ForSupplier {

    public static void main(String[] args) {
        FunctionalInterfaceSupplier Car = ()-> "LamborGini Having only 2 Seats";

        String seats = Car.noOfSeats().toString();

        System.out.println(seats);
    }

}
