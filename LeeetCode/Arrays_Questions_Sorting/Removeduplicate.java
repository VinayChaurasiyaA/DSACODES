package LeeetCode;

import java.util.Arrays;

public class Removeduplicate {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2};
        System.out.println(Arrays.toString(remove(nums)));

    }
    static int[] remove(int[] nums){
        if (nums.length==0){
            return nums;
        }
        for (int i = 0; i < nums.length ; i++) {
            if (i < nums.length-1 &&nums[i]!=i){
                //swap(int[] nums,i,i+1);
                swap(nums , i , i+1);
            }
        }
        return nums;
    }
    static void swap(int[] nums,int first , int second){
        int temp = nums[second];
        nums[second] = nums[first];
        nums[first] = temp;
    }
}
