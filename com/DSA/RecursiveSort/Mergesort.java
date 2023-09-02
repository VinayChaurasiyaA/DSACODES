package com.DSA.RecursiveSort;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println(Arrays.toString(sort(nums)));

    }
    static int[] sort(int[] nums){
       // int[] arr = new int[nums.length];
        if (nums.length==1){
            return nums;
        }
        int mid = nums.length/2;
        int[] left = sort(Arrays.copyOfRange(nums , 0,mid));
        int[] right = sort(Arrays.copyOfRange(nums , mid , nums.length));
        return merge(left ,right);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] sorted = new int[first.length+ second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i< first.length&& j< second.length){
            if (first[i]<second[j]){
                sorted[k] = first[i];
                i++;
            }
            else {
                sorted[k] = second[j];
                j++;
            }
            k++;
        }
        //It maybe possible that ome of the didn't got emptied;
        //Copy the remaining element
        while (i< first.length){
            sorted[k]= first[i];
            i++;
            k++;

        }
        while (j< second.length){
            sorted[k]= first[j];
            j++;
            k++;

        }
        return sorted;
    }
}
