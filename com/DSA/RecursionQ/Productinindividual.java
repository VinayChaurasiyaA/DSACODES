package com.DSA.RecursionQ;

public class Productinindividual {
    public static void main(String[] args) {
        int ans = producy(12);
        System.out.println(ans);

    }
    static int producy(int n){
        if (n%10==n){
            return n;
        }
        return (n%10)*producy(n/10);
    }
}
