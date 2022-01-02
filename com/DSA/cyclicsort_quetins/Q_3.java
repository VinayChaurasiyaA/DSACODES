package com.DSA.cyclicsort_quetins;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-duplicate-number/
public class Q_3 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static int sort(int[] nums){
        int i = 0;

            while (i < nums.length) {
                if ( nums[i] != i+1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }

            }
                else {
                    i++;
                }
        }


    return -1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}


