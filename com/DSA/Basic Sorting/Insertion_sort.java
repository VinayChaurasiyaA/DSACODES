//import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr =  {0,0,1,1,1,3,3,4,2,2};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int  [] arr){

        for (int i = 0; i <= arr.length-2 ; i++) {
            for (int j = i +1; j >0 ; j--) {
                if (arr[j] < arr[j-1] ){
                    swap(arr , j , j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
    static void insertionSort(int A[])
    {
         /* Move elements of A[0..i-1], that
            are greater than max, to one
            position ahead of their current position.
            This loop will run at most k times */
        int size = A.length;
        int i, max, j;
        for (i = 1; i < size; i++)
        {
            max = A[i];
            j = i-1;
            while (j >= 0 && A[j] > max)
            {
                A[j+1] = A[j];
                j = j-1;
            }
            A[j+1] = max;
        }
    }


}
