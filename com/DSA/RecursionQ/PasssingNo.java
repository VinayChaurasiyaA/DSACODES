package com.DSA.RecursionQ;

public class PasssingNo {
    public static void main(String[] args) {
        fun(5);

    }
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(--n);
       // System.out.println(n);
    }
}
