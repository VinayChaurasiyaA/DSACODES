package LeeetCode;

public class insertioninbs {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(search(nums , target));
    }
    static  int search(int[] nums , int target){
        int start = 0;
         int end = nums.length-1;
         while (start<=end){
             int mid = start + (end - start)/2;
             if(nums[mid] ==target ){
                 return mid;
             }
             if (nums[mid]> target){
                 end = mid -1;
             }
             else {
                 start = mid+1;
             }
         }
         return end+1;
    }
}
