package com.DSA.RecursionQ;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {10, 324, 45, 90, 9808};
        int n = arr.length;

        // System.out.println(Arrays.toString(max1(arr,n)));
        System.out.println("min :" + min(arr, n));
        System.out.println("MAX:" + max(arr,n));

    }

    static int min(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        } else {
            return Math.min(arr[n-1], min(arr,n-1));
        }
    }
    static int max(int[] arr , int n){
        if (n==0){
            return arr[0];
        }
        else {
            return Math.max(arr[n-1],max(arr,n-1));
        }
    }
}