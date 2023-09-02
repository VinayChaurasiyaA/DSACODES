package LeeetCode;

import java.util.Arrays;

public class HEightOfstudent {
    public static void main(String[] args) {
        int[] heights ={1,1,4,2,1,3};
        System.out.println(height(heights));
    }
    static int height(int[] heights){
        int[] ans = new int[heights.length];
        for (int i=0;i<heights.length;i++){
            ans[i]=heights[i];
        }
        Arrays.sort(ans);
        int cunt =0;
        for(int i=0;i<heights.length;i++){
            if(ans[i]-heights[i]!=0){
                cunt++;
            }
        }
        return cunt;
    }
}
