package LeeetCode;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,7},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    ans+=mat[i][j];
                }
                else if ((j+i)==(mat.length-1)){
                    ans+=mat[i][j];
                }
            }
        }
        return ans;
    }
}
