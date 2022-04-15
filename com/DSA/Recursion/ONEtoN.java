package com.DSA.Recursion;

public class ONEtoN {
    public static void main(String[] args) {
  //     fun(5);
  //     funrev(5);
       combo(5);

    }
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
       // System.out.println;);
    }
    static void funrev(int n){
        if (n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }
    static void combo(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        combo(n-1);
        System.out.println(n);
    }
}
