package com.DSA.RecursioninArray;

import java.util.ArrayList;

public class ListInLinearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,2};
        System.out.println(search(arr , 3 , 0 , new ArrayList<>()));

    }
    static ArrayList<Integer> search(int[] arr , int target , int index , ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }

        return search(arr , target , index + 1 , list);
    }
}
