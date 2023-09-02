package LeeetCode;

import java.util.Arrays;

public class twoSumTwo {
    public static void main(String[] args) {
        int[] number = {5,25,75};
        System.out.println(Arrays.toString(twosum(number , 100)));
    }
    static int[] twosum(int[] numbers , int target){
        //   int[] arr = new int[2];

        int firstpointer = 0;
        int secondpointer = numbers.length-1;
        while(firstpointer<secondpointer){
            int currentsum = numbers[firstpointer]+numbers[secondpointer];
            if(currentsum>target){
                secondpointer--;
            }
            else if(currentsum<target){
                firstpointer++;
            }
            else{
                return new int[]{firstpointer+1,secondpointer+1};
            }
        }

        return new int[]{-1,-1};

    }
}
