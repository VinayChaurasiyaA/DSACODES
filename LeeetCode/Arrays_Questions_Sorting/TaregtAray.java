package LeeetCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TaregtAray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        String s = "foxjumpsoverthelazydog";
        System.out.println(chech(s));
     //   System.out.println(Arrays.toString(createTargetArray(nums , index)));

    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for(int i =0;i<index.length-1;i++){
            solve(target, nums[i] ,index[i]);
        }
        return target;
    }
     static void solve(int[] target ,int value , int index){
        // int n = nums.length;
         for(int j=target.length-1;j>index;j++){
             target[j] = target[j-1];
         }
         target[index]=value;
     }
     static boolean chech(String s){
         return s.chars().boxed().collect(Collectors.toSet()).size() == 26;
     }
}
