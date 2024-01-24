package com.example.Core.Java.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllValues {
    public static void main(String[] args) {
        Optional<List<Integer>> integerList = Optional.ofNullable(Arrays.asList(1,2,3,4,5));
        System.out.println(countsum(integerList).get());
    }

    public static Optional<Integer> countsum (Optional<List<Integer>> integerList) {
        return (integerList.isPresent()) ? integerList.map(list->list.stream().mapToInt(Integer::intValue).sum()) : Optional.of(0);
    }
}
