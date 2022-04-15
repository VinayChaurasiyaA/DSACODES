package LeeetCode;

import java.util.Arrays;

public class SquareSort {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(anss1(nums)));
    }
    static int[] anss(int[] nums){
        int[] ans = new int[nums.length];
        int t=0;
        for (int num : nums) {
            ans[t++] = num * num;
        }
        Arrays.sort(ans);
        return ans;
    }
    static int[] anss1(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }
}
