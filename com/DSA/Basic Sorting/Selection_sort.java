import java.util.ArrayList;
import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr ={1,3,42,55,2};
       sort(arr);
        //sorting(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = getmax(arr , 0 , last);
            swap(arr , max , last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int  temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getmax(int[] arr, int start, int last) {
        int max = start;
         for (int i = start; i <=last ; i++) {
             if (arr[max]< arr[i]){
                 max = i;
             }
         }
        return max;
    }
   // ArrayList<Integer> list = ArrayList();

//    static void sorting(int[] arr){
//        for (int i = 0; i < arr.length ; i++) {
//            int l = arr.length - i - 1;
//            int s = 0;
//            int min = getmin(arr ,l - i, 0 );
//             s(arr , min , l);
//        }
//    }
//
//    private static int getmin(int[] arr, int s, int l) {
//        int min = Integer.MIN_VALUE;
//        for (int i = s; i <=l ; i++) {
//            if (arr[min]> arr[i]){
//                min = i;
//            }
//        }
//        return min;
//    }
//
//
//    static void s(int[] arr , int first , int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }

}
