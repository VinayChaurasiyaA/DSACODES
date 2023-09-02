package LeeetCode;

import java.util.Arrays;

public class ThridMax {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(max(nums));
    }
    static int max(int[] nums){
        Arrays.sort(nums);
        int count =0;
        for (int i = nums.length-1; i >=0 ; i--) {
            if (i==0&&count<2){
                int ans=0;
                for (int j = 0;j< nums.length;j++){
                    ans = Math.max(nums[j],ans);
                }
                return ans;
            }
           if (nums[i]!=nums[i-1]){
               count++;
               if (count==2){
                   return nums[i-1];
               }
           }
        }
        return -1;
    }
}
