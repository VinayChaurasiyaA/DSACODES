package LeeetCode;

public class subarrayWithsum {
    public static void main(String[] args) {
        int[] nums = {-1,-1,1};
        System.out.println(subarraySum(nums,0));
    }

        static int subarraySum(int[] nums, int k) {
            int count =0;
            int currentsum = 0;
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    currentsum += nums[j]+nums[i];
                    if(currentsum==k){
                        count++;
                        break;
                    }
                }

            }
            for (int num : nums) {
                if (num == k) {
                    count++;
                }
            }
            return count;
        }

}
