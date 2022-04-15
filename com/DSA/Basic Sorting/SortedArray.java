import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        System.out.println(Arrays.toString(search(arr ,7)));

    }
    static int[] bineraysearch(int[][] matrix , int rows , int cstart , int cend , int target ){
        while (cstart <= cend){
            int cmid = cstart + (cend - cstart )/2;

            if (target == matrix[rows][cmid]){
                return new int[]{rows , cmid};
            }

            if (target > matrix[rows][cmid]){
                cstart = cmid +1;
            }
            else {
                cend = cmid -1;
            }
        }
        return new int[]{-1 , -1};

    }


    static int[] search(int[][] matrix ,int target ){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 1){
            bineraysearch(matrix , 0 , 0 , cols -1 , target);
        }
        int rstart = 0;
        int rend = rows -1;
        int cmid = cols/2;
        while (rstart < (rend -1)){
            int rmid = rstart + (rend - rstart)/2;
            if (target==matrix[rmid][cmid]){
                return new int[]{rmid , cmid};
            }
            if (target>matrix[rmid][cmid]){
                rstart = rmid;
            }
            else {
                rend= rmid;

            }
        }
        if (matrix[rstart][cmid ] == target){
            return  new int[]{rstart , cmid};
        }
        if (matrix[rstart+1][cmid]>target){
            return new int[]{rstart + 1 , cmid};
        }

//    1st
        if (target <=matrix[rstart][cmid-1]){
            return bineraysearch(matrix, rstart ,0,cmid-1,target);
        }
//        2nd
        if (target >= matrix[rstart][cmid+1] && target<=matrix[rstart][cols -1]){
            return bineraysearch(matrix ,rstart,cmid +1 ,cols -1 , target );
        }
//        3rd
        if (target >= matrix[rstart+1][cmid -1]){
            return bineraysearch(matrix , rstart+1 , 0 , cmid -1 , target);
        }
//        4th
       else {
           return bineraysearch(matrix , rstart+1 , cmid +1 , cols -1 , target);

        }

    }
}
