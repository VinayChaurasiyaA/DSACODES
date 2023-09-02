package com.DSA.RecursionQ;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(-1));

    }
    static int fac(int n){
        if (n<2 ){
            return 1;
        }

        return n*fac(n-1);
    }
}
