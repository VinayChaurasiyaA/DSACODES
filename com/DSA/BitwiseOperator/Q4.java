package com.DSA.BitwiseOperator;
// Magic no find the nth magic no

public class Q4 {
    public static void main(String[] args) {
        int n = 6;
        int base = 5;

        int ans = 0;
        while (n>0){
            int last = n&1;
            n = n>>1;
            ans = ans + last*base;
            base = base*5;
        }

        System.out.println(ans);

    }
}
