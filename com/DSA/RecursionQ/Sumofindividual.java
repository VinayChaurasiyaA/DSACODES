package com.DSA.RecursionQ;

public class Sumofindividual {
    public static void main(String[] args) {
        int ans = sum(1321);
        System.out.println(ans);
    }
    static int sum(int n){
        if (n%10==0){
            return n;
        }
        return n%10+sum(n/10);
    }
}
