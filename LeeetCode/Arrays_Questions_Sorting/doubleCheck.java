package LeeetCode;

import java.util.Arrays;

public class doubleCheck {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        System.out.println(checkki(arr));
    }
    static boolean checkki(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int ans = 2*arr[i];
            if(arr[i]==0){
                break;
            }
            else if((binarysearch(arr , ans)==ans)){
                return true;
            }

        }
        return false;
    }

    private static int binarysearch(int[] arr, int ans) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end - start)/2;
            if (ans>arr[mid]){
                start=mid+1;
            }
            else if (ans<arr[mid]){
                end=mid-1;
            }
            else {
                return arr[mid];
            }
        }
        return -1;
    }
    //another way of solving mine didn't work
    class Solution {
        public boolean checkIfExist(int[] arr) {
            Arrays.sort(arr);
            int zeroCount = 0;
            for (int x : arr) {
                if (x != 0) {
                    if (binarySearch(x, arr) && binarySearch(x*2, arr)) {
                        return true;
                    }
                }
                else {
                    ++zeroCount;
                }
            }
            return zeroCount >= 2;
        }

        public boolean binarySearch(int x, int[] nums) {
            int start = 0;
            int end = nums.length-1;
            while (start <= end) {
                int mid = start+(end-start)/2;
                if (nums[mid] < x) {
                    start = 1 + mid;
                }
                else if (nums[mid] > x) {
                    end = mid - 1;
                }
                else {
                    return true;
                }
            }
            return false;
        }
    }

}
