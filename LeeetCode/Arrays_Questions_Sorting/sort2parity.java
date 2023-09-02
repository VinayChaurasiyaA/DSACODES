package LeeetCode;

import java.util.Arrays;

public class sort2parity {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sort(nums)));
    }
    static int[] sort(int[] A){
        int i = 0, j = 1, n = A.length;
        while (i < n && j < n) {
            while (i < n && A[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && A[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                swap( A,i, j);
            }
        }
        return A;
    }
    static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
