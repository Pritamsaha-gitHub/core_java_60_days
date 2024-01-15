package com.example.Core.Java.Generics;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArrayUsingGenerics {
    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4,5,6};
        Integer [] intArray2 = {7,8,9,10};

        String [] intArray3 = {"cvg","gjvj","qwer"};
        String [] intArray4 = {"cvn","b j","bk"};

        System.out.println(Arrays.toString(joinTwoArray(intArray,intArray2)));
        System.out.println(Arrays.toString(joinTwoArray(intArray3,intArray4)));
    }

    public static <T> T[] joinTwoArray(T[]firstArray,T[]secondArray) {
        return Stream.concat(Arrays.stream(firstArray),Arrays.stream(secondArray)).toArray(size->Arrays.copyOf(firstArray,size));
    }
}
