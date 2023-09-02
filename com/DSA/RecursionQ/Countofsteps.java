package com.DSA.RecursionQ;

public class Countofsteps {
    public static void main(String[] args) {
        int ans = 12;
        System.out.println(count(ans));

    }
    static int count(int num){
        return helper(num,0);
    }

    private static  int helper(int num, int c) {
        if (num==0){
            return c;
        }
        int even = num%2;
            if (even == 0) {
                return helper(num / 2, c + 1);
            } else
                return helper(num - 1, c + 1);

    }
}
