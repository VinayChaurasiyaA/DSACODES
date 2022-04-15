package LeeetCode;

import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(sma(nums)));

    }
    static int[] smaller(int[] nums){
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                int n = Math.max(nums[i],nums[j]);
                arr[j] = n+1;
            }
        }
        return arr;
    }
    static int[] sma(int[] nums){
        int count = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int start = 0;
            int end = nums.length;
           if (start>end){
               count+=1;
               end=end-i;
           }else {
           start = start+i;
           arr[i] = count;
        }

        }
        return arr;

    }
}
