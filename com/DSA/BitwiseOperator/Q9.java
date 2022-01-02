package com.DSA.BitwiseOperator;
//Find Xor of no from 0 to a
public class Q9 {
    public static void main(String[] args) {
        int a = 5;
//        int n = 2^2;
//        System.out.println(n);
        System.out.println(Xorno(a));

    }

    private static int Xorno(int a) {
        if (a% 4 ==0){
            return a;
        }
        if (a%4 == 2 ){
            return a+1;
        }
        if (a%4 ==1){
            return 1;
        }
        return -1;

    }
}
