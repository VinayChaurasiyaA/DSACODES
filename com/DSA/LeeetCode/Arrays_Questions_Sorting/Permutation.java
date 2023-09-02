package LeeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permute1(nums);

    }
    static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> outerlayer = new ArrayList<>();
//        if (nums.length==0){
//            System.out.println(nums);
//        }
        outerlayer.add(new ArrayList<>());
        for (int n:nums){
            int size= outerlayer.size();
            for (int i = 0; i <size ; i++) {
                List<Integer> internal = new ArrayList<>(outerlayer.get(i));
                internal.add(n);
                outerlayer.add(internal);
            }
        }
        return outerlayer;
    }
    static List<List<Integer>> permute1(int[] nums){
        List<List<Integer>> outerlayer = new ArrayList<>();
        if (outerlayer.isEmpty()){
            System.out.println(outerlayer);
        }
        int n = outerlayer.indexOf(0);
        for (int i = 0; i < outerlayer.size()+1 ; i++) {
//            String first = pro.substring(0,i);
//            String second = pro.substring(i, pro.length());
            List<List<Integer>> left = outerlayer.subList(0,i);
            List<List<Integer>> right = outerlayer.subList(i, outerlayer.size());

        }
        return outerlayer;
    }

}
