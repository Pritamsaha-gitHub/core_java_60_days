package com.example.Core.Java.Optional;


import java.util.Optional;

public class ReturnsoptionalString {
    public static void main(String[] args) {
        Optional<Integer> ans = returnperson(Optional.ofNullable("P"));
        System.out.println(ans.get());
    }

    public static Optional<Integer> returnperson(Optional<String> name) {
        return name.isPresent() ? Optional.of(name.get().length()) : Optional.of(0);
//        return name.ofNullable(Optional.of(0)).orElse(Optional.of(name.get().length()));
    }

}
