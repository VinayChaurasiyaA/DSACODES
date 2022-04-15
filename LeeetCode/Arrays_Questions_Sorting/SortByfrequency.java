package LeeetCode;

import java.util.Arrays;

public class SortByfrequency {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }
    static int[] frequencySort(int[] nums) {
        int[] count = new int[nums.length];
        for(int i: nums){
            count[i]++;
        }
        for(int j: count){
            if(count[j]< count[j+1]){
                return count;
            }
        }
        return count;
    }
}
