package LeeetCode.Arrays_Questions_Sorting;

import java.util.Arrays;

import static java.util.Arrays.*;

public class laststone {
    public static void main(String[] args) {
        int[] stone = {3,7,2};
        System.out.println(lastStoneWeight(stone));
    }
    static int lastStoneWeight(int[] stones) {
        // now i have to only chose x and y;
        if(stones.length==1)return stones[0];
        sort(stones);
        int y = stones.length-1;
        int x = stones.length-2;
        while(x>=0){
            if(stones[x]==stones[y]){
                stones[x] = 0;
                stones[y] = 0;
            }else{
                stones[y] -= stones[x];
                stones[x] = 0;
            }
            sort(stones);
            if(stones[x]==0)break;
        }
        return stones[y];
    }
}
