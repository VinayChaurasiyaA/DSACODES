package LeeetCode;

import java.util.Arrays;

public class MedianOftwoarray {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(findmedian(nums1 , nums2));

    }
    static double findmedian(int[] nums1 , int[] nums2){

        int[] nums = new int[nums1.length+ nums2.length];

        int count = 0;

        for(int i = 0; i < nums1.length; i++) {
            nums[i] = nums1[i];
            count++;
        }
        for(int j = 0; j < nums2.length;j++) {
            nums[count++] = nums2[j];
        }
//        for (int k = 0; k <nums.length ; k++) {
//            System.out.println(nums[k] + " ");
//        }
       // int[] arr = new int[nums.length];
        Arrays.sort(nums);

        return median(nums);



    }
    static double median(int[] nums){
        int start = 0;
        int end = nums.length-1;

        // find mid value if even average of 2 mid
        int mid = start + (end - start)/2;

        if(nums.length%2 !=0){
            return nums[mid];
        }
        int x = nums[mid+1];
        int y = nums[mid];
        // otherwise return value at mid;
        double ans = (x+y);
        double value = ans/2;

        return value;

    }
}
