package com.DSA.RecursionQ;

public class Morewaysofreverse {
    public static void main(String[] args) {
        System.out.println(palin(1234));

    }
    static int rev(int n){
        //Sometimes you might need an additional argument
        // So we should create a new functions
        int a = (int) (Math.log10(n)+1);
        return helper(a,n);
    }

    private static int helper(int a, int n) {
        if (n%10==n){
            return n;
        }
        int  rem = n%10;
        return (int)(rem*Math.pow(10,a-1))+helper(a-1,n/10);

    }
    static boolean palin(int n){
        return n==rev(n);
    }


}
