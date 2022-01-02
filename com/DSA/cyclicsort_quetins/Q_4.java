package com.DSA.cyclicsort_quetins;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
// there is no error its being dick!
public class Q_4 {
    public static List<Integer> main(String[] args , int[] nums) {

            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swaped(nums, i, correct);
                } else {
                    i++;
                }

            }
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index+1){
                    ans.add(nums[index]);
                }
            }
            return ans;

        }





     static void swaped(int[] nums, int first, int second) {
         int temp = nums[first];
         nums[first] = nums[second];
         nums[second] = temp;
    }


}
