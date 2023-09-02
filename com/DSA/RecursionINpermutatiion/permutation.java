package com.DSA.RecursionINpermutatiion;

public class permutation {
    public static void main(String[] args) {
        permutaion("","abc");

    }
    static void permutaion(String pro,String unp){
        if (unp.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch = unp.charAt(0);
        for (int i = 0; i <= pro.length() ; i++) {
            String first = pro.substring(0,i);
            String second = pro.substring(i, pro.length());
            permutaion(first+ch+second,unp.substring(1));
        }

    }
}
