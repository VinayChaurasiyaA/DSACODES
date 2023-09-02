package LeeetCode;

public class MaxSum {
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        sum(arr);

    }
    static int sum(int[] arr){
        int ans = arr[0];
        while (arr.length-1 >0){
            int Maxsum = 0;
            for (int i = 0; i <=arr.length-1 ; i++) {
                Maxsum = arr[i] + arr[i+1];
                ans = Maxsum;
            }
        }
        return ans;
    }


}
