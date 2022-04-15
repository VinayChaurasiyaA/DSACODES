import java.util.Arrays;

public class Bs_2d {
    public static void main(String[] args) {
        int[][] arr ={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
//        int[][] arr2 ={
//                {10,8,30,40},
//                {158,5,35,45},
//                {278,2,37,49},
//                {3,4,38,50}
 //       };
        System.out.println(Arrays.toString(search(arr , 25)));


//        System.out.println(arr.length);
    }

    static int[] search(int[][] arr, int target) {
        int row = 0;
        int coloum = arr.length - 1;
        while (row < arr.length && coloum >= 0) {
            if (arr[row][coloum] == target){
                return new int[]{row , coloum};
            }
            if (arr[row][coloum]< target){
                row++;
            }
            else {
                coloum--;
            }


        }
        return new int[]{-1 , -1};

    }


}
