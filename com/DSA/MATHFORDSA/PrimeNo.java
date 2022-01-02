package com.DSA.MATHFORDSA;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i <= n ; i++) {
            System.out.println(i + " " + isprime(i));
        }
    }

    private static boolean isprime(int n) {
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c*c <=n){
            if (n%c ==0){
                return false;
            }
            c++;
        }
        return true;

    }
}
