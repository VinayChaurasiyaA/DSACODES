package com.DSA.RecursionQ;

public class Fibunacci {
    public static void main(String[] args) {
        fibo(5);
        System.out.println(fibo(5));

    }
    static int fibo(int n){
        if (n < 2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
