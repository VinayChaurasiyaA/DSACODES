package LeeetCode.Arrays_Questions_Sorting;

import java.util.Arrays;

public class boatstosave {
    public static void main(String[] args) {
        int[] arr = {3,3,4,5};
        System.out.println(numRescueBoats(arr , 3));
    }
    static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res =0;
        int heavy = people.length-1;
        int weak =0;
        while(weak<=heavy){
            int remain = limit-people[heavy];
            heavy--;
            res++;
            if(heavy>=weak && remain>=people[weak]){
                weak++;
            }
        }
        return res;
    }
    //acoording to leetcode

        static int numRescueBoats1(int[] people, int limit) {
            Arrays.sort(people);
            int i = 0, j = people.length - 1;
            int ans = 0;

            while (i <= j) {
                ans++;
                if (people[i] + people[j] <= limit)
                    i++;
                j--;
            }

            return ans;
        }

}
