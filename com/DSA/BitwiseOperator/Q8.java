package com.DSA.BitwiseOperator;
//Given a no n find the no of set bit in it.
public class Q8 {
    public static void main(String[] args) {
        int n = 1224;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setDigits(n));
        int ans = 0;
        while (n>0){
            if ((n&1) ==1){
                ans++;
            }
            n = n>>1;
        }
        System.out.println(ans);


    }

    private static int setDigits(int n) {
        int cout = 0;
//        while (n>0){
//
//            n = n - (n & -n);
//            cout++;
//        }
        while (n>0){
            cout++;
            n = n & (n-1);
        }
        return cout;
    }
}
