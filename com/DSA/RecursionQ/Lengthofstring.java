package com.DSA.RecursionQ;

import java.util.Arrays;

public class Lengthofstring {
    public static void main(String[] args) {
        String str = "Geeks";
        System.out.println(length(str));

    }
    static int length(String str){
        if (str.equals("") ){
            return 0;
        }
        else {
            return length(str.substring(1))+1;
        }
    }

}
