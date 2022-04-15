package LeeetCode.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        int[] can = {2,3,5};
        System.out.println(combinationSum(can , 8));
    }
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        findcomboHelper(0 , candidates , target , list , new ArrayList<>());
        return list;
    }
    static private void findcomboHelper(int index , int[] arr , int target ,  List<List<Integer>> list , List<Integer> ds){
        if(index==arr.length){
            if(target==0){
                list.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[index]<=target){
            ds.add(arr[index]);
            findcomboHelper(index , arr , target - arr[index],list , ds);
            ds.remove(ds.size()-1);
        }
        findcomboHelper(index+1 , arr , target , list , ds);
    }
}
