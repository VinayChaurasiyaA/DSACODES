package com.DSA.String;

import java.util.Arrays;
import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(palin(str));

    }
    static boolean palin(String str){
        if (str ==null || str.length() ==0){
            return true;

        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i -1);
            if (start != end){
                return false;
            }
        }
        return true;
    }
}
