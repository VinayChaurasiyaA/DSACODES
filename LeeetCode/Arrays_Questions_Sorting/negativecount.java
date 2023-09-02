package LeeetCode;

public class negativecount {
    public static void main(String[] args) {
        int[][] grid = {{5,1,0},{-5,-5,-5}};
        System.out.println(countnegatice(grid));
    }
    static int countnegatice(int[][] grid){
        int count =0;
        int row = grid[0].length;
        int col = grid.length;
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}
