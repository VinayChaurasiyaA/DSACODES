package LeeetCode;

import java.util.ArrayList;
import java.util.List;

public class Cnaadies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extra = 1;
        System.out.println(kids(candies , extra));
        System.out.println(kids2(candies , extra));

    }
    static List<Boolean> kids(int[] candies , int extraCandies){
        List<Boolean> list = new ArrayList<>();


        for(int i = 0;i<candies.length; i++){
            if (i==0){
                list.add(true);
            }
            if (i>0){
                candies[i] = candies[i] + extraCandies;
                if(candies[i]>candies[i-1]){
                    //return true;
                    list.add(true);
                }
                else{
                    list.add(false);
                    // return false;
                }
            }
        }
        return list;
    }
    static List<Boolean> kid1(int[] candies , int extraCandies){
        int max = -1;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }
        List<Boolean> b = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            b.add(candies[i] + extraCandies >= max);
        }
        return b;

    }
    static List<Boolean> kids2(int[] candies , int extraCandies){
        List<Boolean> list = new ArrayList<>();


        for(int i = 0;i<candies.length; i++){
            if (i==0){
                list.add(true);
            }
            int max = candies[0]+extraCandies;
            if (i>0){
                max = Math.max(candies[i] +extraCandies, max);
               // candies[i] = candies[i] + extraCandies;
                list.add(true);
                for (int j = 0; j <i ; j++) {
                    if (j>0&&candies[j]>candies[j-1]){
                        list.add(true);
                    }
                    else {
                        list.add(false);
                    }
                }
            }
        }
        return list;
    }
}
