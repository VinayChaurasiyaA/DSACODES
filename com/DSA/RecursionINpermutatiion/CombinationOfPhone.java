package com.DSA.RecursionINpermutatiion;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class CombinationOfPhone {
    public static void main(String[] args) {
        lettercombin("","12");

    }
    static void lettercombin(String pro , String unp){
        if(unp.isEmpty()){
            System.out.println(pro);
            return;
        }
        //char ch = ;
        int digits = unp.charAt(0)-'0';
       // digits = (char)(ch + 0);
        for (int i = (digits-1)*3; i < digits*3 ; i++) {
            char change = (char) ('a'+i);
            lettercombin(pro+change, unp.substring(1));

        }


        
    }
}
