package com.DSA.BitwiseOperator;

public class Q1 {
    // Q.Given a no n find if it is odd or even.
    public static void main(String[] args) {
    int n = 68;
    System.out.println(isodd(n));
    }

    private static boolean isodd(int n) {
//        if ((n&1) == 0){
//            return true;
//        }
//        return false;
        return (n&1) == 1;
    }

}
