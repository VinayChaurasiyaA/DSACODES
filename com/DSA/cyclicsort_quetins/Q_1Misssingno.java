package com.DSA.cyclicsort_quetins;

import java.util.Arrays;
//don't know whats issue here T_T:

//https://leetcode.com/problems/missing-number/
public class Q_1Misssingno {
    public static void main(String[] args) {
    int[] arr = {4,0,2,1};
    missingNumber(arr);
    System.out.println(Arrays.toString((arr)));
    }
    static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if ( arr[i] < arr.length && arr[i] !=arr[correct]){
                swap(arr , i , correct);
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

   static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =  temp;

    }
}
