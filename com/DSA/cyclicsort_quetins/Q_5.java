package com.DSA.cyclicsort_quetins;
//https://leetcode.com/problems/set-mismatch/
import java.lang.reflect.Array;
import java.util.Arrays;

public class Q_5 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        findErrorNums(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index +1){
                    return new int[]{nums[index] , index +1};
                }
            }

        return new int[]{-1,-1};
    }

     static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
