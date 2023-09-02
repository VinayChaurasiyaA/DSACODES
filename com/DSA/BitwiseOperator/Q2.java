package com.DSA.BitwiseOperator;
// For every no find the unique no in the array
 public class Q2 {
    public static void main(String[] args) {
     int[] arr = {1,2,2,3,3,1,5};
     System.out.println(unique(arr));
    }

 private static int unique(int[] arr) {
     int unique = 0;
     for (int n : arr){
      unique ^= n;
     }
     return unique;
 }


}
