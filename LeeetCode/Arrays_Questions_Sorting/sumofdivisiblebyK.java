package LeeetCode.Arrays_Questions_Sorting;

public class sumofdivisiblebyK {
    public static void main(String[] args) {
        int[] nums = {-10};
        int k = 5;
        System.out.println(subarraySum(nums , k));
    }
    static int subarraySum(int[] nums, int k) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j =i;j<nums.length;j++){
                sum+=nums[j];
                if(sum % k == 0){
                    count++;
                }
            }
        }

        return count;
    }
}
