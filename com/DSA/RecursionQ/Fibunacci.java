package com.DSA.RecursionQ;

public class Fibunacci {
    public static void main(String[] args) {
        fibo(2);
        System.out.println(fibo(2));

    }
    static int fibo(int n){
        if (n < 2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
