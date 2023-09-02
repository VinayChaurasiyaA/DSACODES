package LeeetCode;

//import static LeeetCode.Removeduplicate.swap;

import java.util.Arrays;

public class sortbyparity {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(sort1(nums)));
    }
    static int[] sort1(int[] nums) {
        int[] arr = new int[nums.length];
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[t++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] % 2 == 1) {
                arr[t++] = nums[i];
            }
        }
        return arr;


    }


    static int[] sort(int[] A){
        int[] B = new int[A.length];

            for (int t = 0; t < A.length; ++t)
                B[t] = A[t];

            //Arrays.sort(B,(a,b)->Integer.compare(a%2,b%2);
        Arrays.stream(A);

            for (int t = 0; t < A.length; ++t)
                A[t] = B[t];
            return A;

        /* Alternative:
        return Arrays.stream(A)
                     .boxed()
                     .sorted((a, b) -> Integer.compare(a%2, b%2))
                     .mapToInt(i -> i)
                     .toArray();
        */
        }





    private static void swap(int[] nums, int one, int two) {
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two]=temp;

    }


}
