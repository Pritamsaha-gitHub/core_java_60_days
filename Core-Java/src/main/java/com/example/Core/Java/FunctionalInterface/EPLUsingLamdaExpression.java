package com.example.Core.Java.FunctionalInterface;

public class EPLUsingLamdaExpression {

    public static void main(String[] args) {
        Football football = (int number) -> {
            System.out.println("No of Rules " + number);
        };
        football.noOfRules(40);
    }
}
