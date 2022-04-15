package LeeetCode;

public class SpecialArray {
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(sepcial(nums));
    }
    static int sepcial(int[] nums){

        for(int i = nums.length-1;i>=0;i--) {
            int count = 0;
            for (int j = nums.length-1; j>=0; j--) {

                if (nums[j] >= i) {
                    count++;
                    if (count == i) {
                        return i;
                    }
                }
            }
            }

        return -1;
    }
}
