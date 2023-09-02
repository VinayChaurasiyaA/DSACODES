package LeeetCode;

public class GuessGme {
    public static void main(String[] args) {
        int nums = 6;
        System.out.println(guess(nums));

    }
    static int guess(int nums){
        int strt = 1;
        int end = nums;
        while (strt<=end){
            int mid = (strt + end)/2;
            if (mid == nums){
                return mid;
            }
            if (mid > nums){
                end = mid-1;
            }
            else {
                strt = mid+1;
            }
        }
        return strt;
    }
}
