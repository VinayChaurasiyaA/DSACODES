package LeeetCode;

import java.util.Arrays;

public class intersetion {
    public static void main(String[] args) {
        int[] nums1 ={1,2,2,3};
        int[] nums2 = {2,21,1,2};
        System.out.println(Arrays.toString(inter(nums1 , nums2)));
    }
    static int[] inter(int[] nums1 , int[] nums2){

        int[] ans = new int[nums1.length];
        int add = 0;

        for(int i =0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans[add]=nums1[i];
                    add++;
                    break;
                }
            }
        }

        return ans;
    }
}
