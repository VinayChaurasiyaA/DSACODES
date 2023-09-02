package LeeetCode;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {

    }
    static int part(int[] nums){
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0;i<nums.length;i+=2){
            ans+=Math.min(nums[i],nums[i+1]);
            i++;
        }
        return ans;
    }
}
