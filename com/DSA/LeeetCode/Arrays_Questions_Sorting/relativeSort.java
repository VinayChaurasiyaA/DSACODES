package LeeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class relativeSort {
    public static void main(String[] args) {
        int[] arr1 ={2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(se(arr1 , arr2)));
    }
    static int[] se(int[] arr1 , int[] arr2){
        int[] ans = new int[arr1.length];
        int t = 0;
        for(int i = 0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    ans[t++]=arr2[i];
                }
            }
        }

        int gh=0;
        ArrayList<Integer> gm=new ArrayList<Integer>();
        for(int i=0;i<arr1.length;i++)
        {
            int tg=arr1[i];
            for(int j=0;j<arr2.length;j++)
            {
                if(tg==arr2[j])
                {
                    gh=1;
                    break;
                }
            }
            if(gh==0)
            {
                gm.add(tg);
            }
            gh=0;
        }
        Collections.sort(gm);
        for(int i=0;i<gm.size();i++)
        {
            ans[t++]=gm.get(i);
        }
        //return output;
        return ans;
    }

}
