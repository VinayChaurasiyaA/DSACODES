package com.DSA.RecursionQ;

public class OneTONwoloop {
    public static void main(String[] args) {

        print(1);

    }
    static void print(int n){
        if (n == n){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
