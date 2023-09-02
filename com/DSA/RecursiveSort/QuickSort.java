package com.DSA.RecursiveSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int low = 0;
        int hi = nums.length-1;
       // System.out.println(sort(nums , low , hi));;
        sort(nums , low , hi);
        System.out.println(Arrays.toString(nums));

    }
    static void sort(int[] nums , int low , int hi){
        if (low>=hi){
            return;
        }
        int start = low;
        int end = hi;
        int mid = start + (end - start)/2;
        int pivot = nums[mid];
        while (start<=end){
            while (nums[start]<pivot){
                start++;
            }
            while (nums[end]>pivot){
                end--;
            }
            if (start<=end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        sort(nums , low , end);
        sort(nums , start , hi);
    }
}
