package com.example.Core.Java.Optional;

import java.util.Optional;

public class SquareOfANumber {
    public static void main(String[] args) {
        Optional<Integer> ans = squreNumber(Optional.ofNullable(11));
        System.out.println(ans.get());
    }

    public static Optional<Integer> squreNumber (Optional<Integer> number) {
        return number.isPresent() ? Optional.of(number.get() * number.get()) : Optional.of(0);
    }
}
