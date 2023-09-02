package LeeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){

                    ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
    static void swap(int[][] matrix , int i, int j){
        int temp = i;
        i=j;
        j=temp;
    }
}
