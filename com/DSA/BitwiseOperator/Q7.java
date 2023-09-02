package com.DSA.BitwiseOperator;
// Find the of nth row of pascals triangle
public class Q7 {
    public static void main(String[] args) {
        int n = 5;
        int ans = 0;
        ans = 1<<(n-1);
        System.out.println(ans);
    }
}
