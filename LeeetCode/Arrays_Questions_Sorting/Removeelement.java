package LeeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Removeelement {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeelement(nums , 1));
    }
//    static int removeelemenr(int[] nums , int val){
//        int n=nums.length;
//        int k=0;
//        for (int i = 0; i <nums.length ; i++) {
//            if (nums[i]==val){
//                for (int j = i; j < nums.length ; j++) {
//                    nums[j]=nums[j+1];
//                }
//
//            }
//        k=n- nums.length;
//        }
//        return k;
//    }
    static int removeelement(int[] nums , int val){
        if (nums.length==0) return 0;
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
