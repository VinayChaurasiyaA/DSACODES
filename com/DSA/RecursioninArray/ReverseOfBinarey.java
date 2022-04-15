package com.DSA.RecursioninArray;

public class ReverseOfBinarey {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(reverse(arr, 8 , 0 , arr.length -1));

    }
    static  int reverse(int[] arr , int taregt , int start , int end){
        if (start>end){
            return -1;
        }
        int mid = start + ( end - start)/2;
        if (arr[mid] == taregt){
            return mid;
        }
//        if (arr[start]>=taregt && arr[mid] <= taregt ){
//            return reverse(arr , taregt , start , mid -1);
//        }
//        else {
//            return reverse(arr , taregt , mid + 1 , end);
//        }
        if (arr[start]<=arr[mid]){
            if (taregt>=arr[start] && arr[mid]>=taregt){
                return reverse(arr , taregt , start , mid -1);

            }
            else {
                return reverse(arr , taregt , mid +1 , end);
            }
        }
//        if (arr[start]>=arr[mid]){
//            if (taregt>=arr[start] && arr[mid]<= taregt){
//                return  reverse( arr , taregt , )
//            }
//        }
        if (taregt>=arr[mid] && taregt<=arr[end]){
            return reverse(arr , taregt , mid +1 , end);
        }
        return reverse(arr , taregt  , start , mid-1 );

    }
}
