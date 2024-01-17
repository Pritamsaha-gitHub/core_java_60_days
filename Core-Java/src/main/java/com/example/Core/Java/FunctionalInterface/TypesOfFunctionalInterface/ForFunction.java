package com.example.Core.Java.FunctionalInterface.TypesOfFunctionalInterface;

public class ForFunction {

    public static void main(String[] args) {
        FunctionalInterfaceFunction Ranking = (rank)->{
          return "In India Ford's Brand Rank is:- " + rank ;
        };
        System.out.println(Ranking.globalBrandRanking(1));
    }
}
