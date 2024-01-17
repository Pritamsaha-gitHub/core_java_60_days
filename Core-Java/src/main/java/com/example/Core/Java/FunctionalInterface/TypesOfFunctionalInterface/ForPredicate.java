package com.example.Core.Java.FunctionalInterface.TypesOfFunctionalInterface;

public class ForPredicate {
    public static void main(String[] args) {
        FunctionalInterfaceForPredicate isStatementTrue = (rank) -> {
            if ((Integer) rank == 1) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println("Thar is Most popular car in India this Statement is :- " + isStatementTrue.mostSellingCar(1));
    }
}
