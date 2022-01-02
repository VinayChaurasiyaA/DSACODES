package com.DSA.Recursion;
// Recursion: When a function calls itself it is known as recursion.
// Why Recursion : ^Because it helps to solve bigger questions in simple ways.
//                 ^You can convert *Recursion* solution into iteration and vice versa.
//                 ^Space and complexity is not constant because of recursion calls.
public class Intro_recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,44,55,66};
        int target = 44;
        System.out.println(BS(arr,  0 , arr.length-1,target));
    }
    //Variables: 1.in argument,
    // 2.Return type
    // 3.body of the function.
    static int BS(int[] nums,int start,int end ,int target ){
        start = nums[0];
        end = nums.length-1;
        if (start>end){
            return -1;
        }
        int mid = start+ (end - start)/2;
        if (nums[mid] == target ){
            return mid;
        }
        if (nums[mid] > target){
            return BS(nums , 0,mid - 1 ,target);
        }
        return BS(nums , mid+1,end ,target);

    }
    //recursion in bs

}
