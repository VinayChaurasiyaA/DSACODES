package com.DSA.RecursionInString;

import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
        searchasci("", "abc");
        System.out.println(subsetreturnAsci("","abc"));

    }
    static void searchasci(String pro, String nonpro){
        if (nonpro.isEmpty()){
            System.out.print(pro+ " ");
            return;
        }
        char ch = nonpro.charAt(0);
        searchasci(pro+ch , nonpro.substring(1));
        searchasci(pro , nonpro.substring(1));
        searchasci(pro+(ch+0), nonpro.substring(1));
    }
    static ArrayList<String> subsetreturnAsci(String p , String unp){
        if (unp.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = unp.charAt(0);
        ArrayList<String> first = subsetreturnAsci(p+ch,unp.substring(1));
        ArrayList<String> seacond = subsetreturnAsci(p,unp.substring(1));
        ArrayList<String> third = subsetreturnAsci(p+(ch+0),unp.substring(1));
        first.addAll(seacond);
        first.addAll(third);
        //left.addAll(right);
        return first;// return left or right both will conclude the same as left is storing all the right  values
    }
}
