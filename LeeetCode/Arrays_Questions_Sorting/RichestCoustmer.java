package LeeetCode;

public class RichestCoustmer {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(max(accounts));

    }
    static int max(int[][] accounts){
        int sum = 0;
        for (int[] row :accounts) {
            int curent = 0;
            for (int col : row) {
                curent = curent+col;
            }
            sum = Math.max(sum , curent);
        }
        return sum;


    }
}
