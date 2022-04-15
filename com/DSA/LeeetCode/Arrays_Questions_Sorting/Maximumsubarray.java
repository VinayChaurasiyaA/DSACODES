package LeeetCode;

import java.util.Arrays;

public class Maximumsubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }
    static int maxSubArray(int[] nums) {
       // Arrays.sort(nums);
//        if (nums.length-1==0){
//            return nums[0];
//        }
//        int max = nums[0];
        int max = Integer.MIN_VALUE;
        int currentsum = nums[0];
        for (int i = 0; i < nums.length ; i++) {
            currentsum = Math.max(currentsum +nums[i], nums[i]);
            max = Math.max(max,currentsum);
        }
     return max;
    }

}
