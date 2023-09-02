package com.DSA.RecursionQ;

public class COuntZerosWrec {
    public static void main(String[] args) {
        System.out.println(count(1290032));

    }
    static int count(int n){
       // int digits = (int) (Math.log10(n)+1);
        return helper(n,0);
    }
//HOw  to pass the value to up
    private static int helper(int n, int counts) {
        if (n==0){
            return counts;
        }
        int rem = n%10;
        if (rem==0) {
            return helper(n / 10, counts + 1);
        }
        return helper(n/10 , counts);

    }
}
