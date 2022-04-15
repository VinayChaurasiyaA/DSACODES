package LeeetCode;

import java.util.Arrays;

public class Concetation {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(a(nums)));

    }
    static int[] a(int[] nums){
        int n = nums.length;
        int[] ans = new int[2* nums.length];
        int psd = 0;
        for (int i = 0; i < nums.length ; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0;i< nums.length ; i++) {
            ans[psd]=nums[i];
            psd++;
        }

        return ans;
    }
}
