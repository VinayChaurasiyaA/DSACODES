package LeeetCode.Arrays_Questions_Sorting;

import java.util.Arrays;

public class plusone {
    public static void main(String[] args) {
        int[] a ={1,2};
        System.out.println(Arrays.toString(plusOne1(a)));
    }
    static int[] plusOne(int[] A) {

        int[] arr = new int[A.length];
        int t=arr.length-1;
        int K =1;
        for (int i = A.length - 1; i >= 0; --i) {
            arr[t--]=(A[i] + K) % 10;
            K = (A[i] + K) / 10;
        }
        while (K > 0) {
            arr[t--]= K % 10;
            K /= 10;
        }
        return arr;
    }
    static int[] plusOne1(int[] digits) {

        if(digits[0] == 0) {
            return new int[]{1};
        }
        int i = digits.length - 1;
        //The while loop will convert 9 to 0 eg: 8999 -> 8000, and after the while loop the i is on the index 0
        while(i >= 0 && digits[i] == 9){
            digits[i] = 0;
            i--;
        }
        // this will check when the digits are all 9, eg: after the previous while loop 9999 will become 0000
        // and we know we should increment the length by 1
        if(digits[0] == 0){
            //By default, the digits will be all 0 without initialization
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
        digits[i] = digits[i] + 1;
        return digits;

    }

}
