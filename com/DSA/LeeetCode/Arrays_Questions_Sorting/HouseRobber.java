package LeeetCode;
// Wrong
public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(rob(nums));

    }
    static int rob(int[] nums){
        int n = nums.length;

        int ans = 0;
        if (n==0){
            return nums[0];
        }

        for (int i = 0; i < n; i++) {


            if ((i%2) == 0){
                ans = ans + nums[i];
                if (n==2){
                    if (i>0&&nums[i]>nums[i-1]){
                        ans = nums[i];
                    }
                    else ans=nums[i-1];
                }

            }

            i++;
        }
        return ans;
    }
}
