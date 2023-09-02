package LeeetCode;

import java.util.Arrays;

public class gasStaion {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
//    static int canCompleteCircuit(int[] gas, int[] cost) {
//        int tank=0;
//       // int cost1=0;
//        for(int i=0;i<cost.length;i++){
//            if(cost[i]>gas.length-1){
//                tank+= gas[0] -i;
//            }
//            else{
//                tank+=gas[cost[i]]-i;
//            }
//        }
//        return tank;
//    }

    static int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum()<Arrays.stream(cost).sum()){
            return -1;
        }
        int total=0;
        int res = 0;
        for (int i =0;i<cost.length;i++){
            total+=(gas[i]-cost[i]);
            if(total>0){
                total=total;
            }
            else {
                total=0;
                res=i+1;
            }
        }
        return res;
  }
}
