package LeeetCode;

public class LargestNo {
    public static void main(String[] args) {
        int[] nums={3,30,34,5,9};
        System.out.println(max(nums));
    }
    static String max(int[] nums){
        StringBuilder str = new StringBuilder();
        for (int i = nums.length-1; i >=0 ; i--) {
            str.append(nums[i]);
        }
        return str.toString();
    }

}
