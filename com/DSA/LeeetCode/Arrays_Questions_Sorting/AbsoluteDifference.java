package LeeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AbsoluteDifference {
    public static void main(String[] args) {

    }
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0 ; i<arr.length;i++){
            for(int j = i+1 ; j<arr.length ; j++){
                ans = Math.min(arr[j]-arr[i],ans);
                if(arr[j]-arr[i]==ans){
                    list.add(i, Collections.singletonList(j));
                }
            }
        }
        return list;
    }
}
