package com.DSA.RecursionInString;
// In subset method firstly we are supposed to make 2 annotation of process and unprocessed.
import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
//        subset("","abc");
        System.out.println(subsetreturn("","abc"));
        System.out.println(subtom("","abc",new ArrayList<>()));
    }
    static  void subset(String p , String unp){
        if (unp.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = unp.charAt(0);
        subset(p+ch, unp.substring(1));
        subset(p, unp.substring(1));
    }
    // learn that there are 2 ways of processing this either we can write arraylist in parameter or in return data type
    static ArrayList<String> subsetreturn(String p , String unp){
        if (unp.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = unp.charAt(0);
        ArrayList<String> left = subsetreturn(p+ch,unp.substring(1));
        ArrayList<String> right = subsetreturn(p,unp.substring(1));
        left.addAll(right);
        return left;// return left or right both will conclude the same as left is storing all the right  values
    }
    static ArrayList<String> subtom(String p , String unp, ArrayList<String> list){
        if (unp.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = unp.charAt(0);
       // ArrayList<String> left = subtom(p+ch, unp.substring(1));
        ArrayList<String> left = subtom(p+ch , unp.substring(1), list);
        ArrayList<String> right = subtom(p , unp.substring(1), list);
        return list;


    }


}
