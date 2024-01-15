package com.example.Core.Java.FunctionalInterface;

public class ChampionsLeagueAnonmous{


    public static void main(String[] args) {

        Football football = new Football() {
            @Override
            public void noOfRules(int number) {
                System.out.println("No of rules " + number);
            }
        };
        football.noOfRules(30);
    }

}
