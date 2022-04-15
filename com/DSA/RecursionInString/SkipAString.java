package com.DSA.RecursionInString;

import java.util.Locale;

public class SkipAString {
    public static void main(String[] args) {
        String unprocess = "Bapplex";
        System.out.println(skipApple(unprocess));
    }
    static String skipApple(String up) {
        up = up.toLowerCase(Locale.ROOT);
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }

    }
}
