package LeeetCode;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target =6;
        System.out.println(Arrays.toString(twosum(nums , target)));

    }
    static int[] twosum(int[] nums, int target){
        Arrays.sort(nums);
        int pointer1 = 0;
        int pointer2 = nums.length-1;
        while (pointer1<=pointer2){
            int sum = nums[pointer1]+nums[pointer2];
            if (sum == target){
                return new int[]{pointer1 , pointer2};
            }
            else if (sum<target){
                pointer1++;

            }
            pointer2--;

        }
        return new int[]{-1,-1};
    }

}
