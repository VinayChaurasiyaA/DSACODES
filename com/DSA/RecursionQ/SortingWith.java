package com.DSA.RecursionQ;

public class SortingWith {
    public static void main(String[] args) {
        int[] nums = {1,2,3,6,4};
        System.out.println(sort(nums , 4));

    }
    static boolean sort(int[] nums , int n){
        if (n==0||n==1){
            return true;
        }
        if (nums[n]<nums[n-1]){
            return false;
        }
      //  for (int check:nums) {
        //    if (nums[])

        return sort(nums , n-1);
    }
}
