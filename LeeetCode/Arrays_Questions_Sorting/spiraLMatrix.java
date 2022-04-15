package LeeetCode;

import java.util.ArrayList;
import java.util.List;

public class spiraLMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(matrix));
    }

    static List<Integer> spiral(int[][] matrix){
        int rowst = 0;
        int colst = 0;
        int rowend = matrix.length-1;
        int colend = matrix[0].length-1;
        List<Integer> list = new ArrayList<>();
        while (rowst<=rowend&&colst<=colend) {
            for (int i = colst; i <= colend; i++) {
                //traverse right
                list.add(matrix[rowst][i]);
            }
            rowst++;
            for (int i = rowst; i <= rowend; i++) {
                //traverse left
                list.add(matrix[i][colend]);
            }
            colend--;
            if (rowst<=rowend) {
                for (int i = colend; i >=colst; i--) {
                    list.add(matrix[rowend][i]);
                }
            }
            rowend--;
            if (colst<=colend){
                for (int i = rowend; i >=rowst ; i--) {
                    list.add(matrix[i][colst]);
                }
            }
            colst++;
        }

        return list;
    }
}
