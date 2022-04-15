package com.DSA.RecursionQ;

public class CountZeroWoREC {
  //  static int ans = 0;
    static int count(int n){
        int ans = 0;
        while (n>0){
            if (n%10==0){
                ans=ans +1;
            }
            n=n/10;
        }

        return ans;
    }


    public static void main(String[] args) {
        int ans =count(100002);

        System.out.println(ans);

    }

}
