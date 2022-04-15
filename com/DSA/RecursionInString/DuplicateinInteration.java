package com.DSA.RecursionInString;

import java.util.ArrayList;
import java.util.List;

public class DuplicateinInteration {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        List<List<Integer>> ans = arr1(nums);
        for (List<Integer> list:ans){
            System.out.print(list);
        }

    }
    static List<List<Integer>> arr1(int[] nums){
        List<List<Integer>> outerlayer = new ArrayList<>();
        // outerlayer.size(new ArrayList<>())
        outerlayer.add(new ArrayList<>());
        for (int j=0;j< nums.length;j++){
            int start = 0;
            int end = 0;
            // if n-1 == n then skip first kinda internal
            if ( j>0 &&nums[j-1]==nums[j]){
                start = end +1;
            }
            end = outerlayer.size()-1;
            int n = outerlayer.size();

// When you find a duplicate element, only add it in the newly created subset of previous steps
            // Because of above points, duplicates must have to be side by side, if case will be [1,2,1]
            // then it'll not work in the case of [1,2,1];
            // to resolve this issue sort out the array'
            for (int i = start; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outerlayer.get(i));
                internal.add(nums[j]);
                outerlayer.add(internal);

            }
        }
        return outerlayer;
    }
}
