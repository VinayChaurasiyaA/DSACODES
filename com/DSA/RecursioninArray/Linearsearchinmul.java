package com.DSA.RecursioninArray;

import java.util.ArrayList;

public class Linearsearchinmul {
    public static void main(String[] args) {
        int[] arr = {1,2,7,2,3,4};
        multi(arr , 2, 0);
        System.out.println(list);

    }
    static  ArrayList<Integer> list = new ArrayList<>();
    static void multi(int[] arr, int target , int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        multi(arr , target , index+1);
    }
}

