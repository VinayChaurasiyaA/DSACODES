package LeeetCode;

import java.util.ArrayList;
import java.util.List;

public class Major {
    public static void main(String[] args) {
        int[] nums = {3,2};
        System.out.println(majorityElement(nums));
    }
    static List<Integer> majorityElement(int[] nums) {
        int ansIndex = 0;
        int  count = 1;

        int major = nums.length/3;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ansIndex){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ansIndex =nums[i];
                count=1;
            }
        }
        for (int num : nums) {
            if (num == ansIndex) {
                count++;
            }
        }
        if(count>major){
            list.add(ansIndex);
        }

        return list;

    }
}
