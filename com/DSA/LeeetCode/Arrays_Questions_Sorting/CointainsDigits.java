package LeeetCode;

import java.util.Arrays;
// k is actually the no of difference of i and j from eachother at most.
public class CointainsDigits {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1};
        System.out.println(contains(nums , nums.length));

    }
     static  boolean contains(int[] nums, int k){
         Arrays.sort(nums);
        int ans = 0;
         for (int i = 0; i < k; i++) {
             if (i>0&&nums[i]==nums[i-1]){
                 ans =ans+1;
             }
         }


        if (ans==1){
            return true;
        }
        return false;
     }
}
