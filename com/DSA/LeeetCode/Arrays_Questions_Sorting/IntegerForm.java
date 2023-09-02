package LeeetCode;

import java.util.ArrayList;
import java.util.List;

public class IntegerForm {
    public static void main(String[] args) {
        int[] num= {9};
        System.out.println(arrat(num,5 ));
    }
    static List<Integer> arrat(int[] num , int k){
        List<Integer> list = new ArrayList<>();
        int m=0;

            for (int i = 0; i < num.length; i++) {
                m += (int) (num[i] * Math.pow(10, num.length - i-1));
            }
            int n=m+k;

               for (int j = 0; j < num.length; j++) {
                   n = (int) (n/ Math.pow(10, num.length - j - 1));
                   list.add(n);
                   m=m/10;
               }

            return list;
    }
//    static List<Integer> addToArrayForm(int[] A) {
//        int K =1;
//        List<Integer> res = new ArrayList<>();
//      //  for (int i = A.length - 1; i >= 0; --i) {
//            res.add(0, (A[i] + K) % 10);
//            K = (A[i] + K) / 10;
//        }
//        while (K > 0) {
//            res.add(0, K % 10);
//            K /= 10;
//        }
//        return res;
//    }
//    static int[] add(int[] A){
//        int K =1;
//        int[] res = new int[26];
//        for (int i = A.length - 1; i >= 0; --i) {
//            res.(0, (A[i] + K) % 10);
//            K = (A[i] + K) / 10;
//        }
//        while (K > 0) {
//            res.add(0, K % 10);
//            K /= 10;
//        }
//        return res;
//    }
}
