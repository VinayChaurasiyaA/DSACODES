package com.DSA.cyclicsort_quetins;

//import java.util.Arrays;
//
//public class Cyclic {
//    public static void main(String[] args) {
//    int[] arr = {2,42,56,6,1};
//    sort(arr);
//    System.out.println(Arrays.toString(arr));
//    }
//    static void sort(int[] arr ){
//        int i =0;
//        while (i<arr.length){
//            int correct = arr[i] -1;
//            if (arr[i] != arr[correct] ){
//                swap(arr , i, correct );
//            }else{
//                i++;
//            }
//        }
//    }
//
//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//}
import java.util.Arrays;

/**
 * cyclic_sort
 */
public class Cyclic {

    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if( arr[i] != arr[correct]){
                swap(arr , i , correct);
            } else{
                i++;
            }

        }


    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}