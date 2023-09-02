package com.DSA.RecursionQ;

import java.util.Arrays;

public class TreeSum {

    public static void main(String[] args) {

       // TreeSum task = new TreeSum();
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
       sum(arr , n);
        //System.out.println(Arrays.toString(sum(arr,n)));
      //  task.sum(arr,n);
  }
    static void sum(int[] arr, int n){
        if (n<1){
            return;
        }
        else {
            int[] temp = new int[n-1];
            int sum1 =0;
            for (int i = 0; i <n-1 ; i++) {
                sum1 = arr[i] + arr[i+1];
                temp[i] = sum1;
            }
            sum(temp,n-1);
            for (int i = 0; i < n; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println();
        }

    }


}
