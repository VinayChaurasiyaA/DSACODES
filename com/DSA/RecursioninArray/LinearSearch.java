package com.DSA.RecursioninArray;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(search(arr , 4 , 0));
        System.out.println(searchfromback(arr , 4,arr.length -1));

    }
    static int search(int[] arr , int target ,int index) {
        if(index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return search(arr , target , index +1);
    }
    static  int searchfromback(int[] arr , int target , int index ){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return searchfromback(arr , target , index -1);
    }
}
