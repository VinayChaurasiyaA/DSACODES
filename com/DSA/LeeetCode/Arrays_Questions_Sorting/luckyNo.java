package LeeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class luckyNo {
    public static void main(String[] args) {
        int[][] matris = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(gettt(matris));
    }
    static List<Integer> gett(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int possible_maxvalue = 0;
        for (int i = 0; i<matrix.length;i++){
          // possible_maxvalue = Math.min(possible_maxvalue , matrix[i][0]);
            if ((matrix[0][i]-matrix[0][i+1]<0)&&(i<matrix.length-1)){
                for (int j = 0; j < matrix.length; j++) {
                    possible_maxvalue=Math.max(possible_maxvalue , matrix[0][j]);
                    list.add(i);
                }
            }
        }
        return list;
   }
   static List<Integer> gettt(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int[] a = new int[m];
        int[] b = new int[n];
       Arrays.fill(a , Integer.MAX_VALUE);
       //Matrix[0] shows rows not column
       // we used max function because if we won't it will keep taking 0 as the minimum value as all number are positive values
       for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
               a[i] = Math.min(matrix[i][j] , a[i]);
               b[j]= Math.max(matrix[i][j] , b[j]);
           }
       }
       for (int i = 0; i < m; ++i) {
           for (int j = 0; j < n; ++j) {
               if (a[i] == b[j])  {
                   list.add(a[i]);
                   break;
               }
           }
       }
       return list;
   }
}
