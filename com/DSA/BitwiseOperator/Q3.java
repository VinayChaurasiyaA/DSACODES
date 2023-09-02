package com.DSA.BitwiseOperator;
// Find i^th bit of a number.
// correct it later.
public class Q3 {
    public static void main(String[] args) {
    int x = 1010010;
    int n = 5;
        System.out.println(noofi(n));
    }

    private static int noofi(int n) {
        int no = 0;
        no= n&(1<<(n-1));
        return no;
    }

}
