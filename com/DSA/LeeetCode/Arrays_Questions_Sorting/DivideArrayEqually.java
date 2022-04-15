package LeeetCode.Arrays_Questions_Sorting;

public class DivideArrayEqually {
    public static void main(String[] args) {
        int[] as ={3,2,3,2,2,2};
        System.out.println(divideArray(as));
    }


        static boolean divideArray(int[] nums) {
            int[] arr = new int[501];
            int testCaseNumber = 0;
            testCaseNumber++;
            int remain = 0;
            for (int i : nums) {
                if (arr[i] == testCaseNumber) {
                    arr[i] = 0;
                    remain--;
                } else {
                    arr[i] = testCaseNumber;
                    remain++;
                }
            }
            return remain == 0;
        }
    }

