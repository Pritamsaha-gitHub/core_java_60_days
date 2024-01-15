package com.example.Core.Java.Generics;

import java.util.Arrays;
import java.util.List;

public class SwapTwoElementOfAnArray {

    public static void main(String[] args) {
        String[] stringList = {"abc","def","ghi","rty"};
        Integer[] intList = {1,2,3,4,5,6};
        Double[] doubleList = {12.1,32.1,23.4};
        dataSwap(stringList,1,3);
        dataSwap(intList,1,3);
        dataSwap(doubleList,1,2);

        System.out.println(Arrays.toString(stringList));
        System.out.println(Arrays.toString(intList));
        System.out.println(Arrays.toString(doubleList));
    }

    public static <T>void dataSwap(T [] dataList , int pos1 , int pos2) {

        T currentData = dataList[pos1];
        dataList[pos1] = dataList[pos2];
        dataList[pos2] = currentData;
    }
}
