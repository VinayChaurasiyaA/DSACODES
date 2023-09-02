package com.DSA.RecursioninArray;

import java.util.ArrayList;

//VVI
public class LiearsearchWoPara {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};
        System.out.println(boom(arr , 2 , 0));
    }
    static ArrayList<Integer> boom(int[] arr, int taregt , int index){
        ArrayList<Integer> lst = new ArrayList<>();
        if (index == arr.length){
            return lst;
        }
        if (arr[index]==taregt){
            lst.add(index);
        }
        ArrayList<Integer> ansfrombelow = boom(arr , taregt , index +1);
        lst.addAll(ansfrombelow);
        return lst;
    }
}
