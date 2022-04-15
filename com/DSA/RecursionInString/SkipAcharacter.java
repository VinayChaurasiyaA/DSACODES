package com.DSA.RecursionInString;

public class SkipAcharacter {
    public static void main(String[] args) {
        String str = "banana";
       // search("",str);
        System.out.println(search1(str));
    }
    static void search(String process , String unprocess){
        if (unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        if (ch == 'a'){
            search(process,unprocess.substring(1));
        }
        else {
            search(process+ch,unprocess.substring(1));
        }
    }
    static String search1(String str){
        if (str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a'){
            return search1(str.substring(1));

        }
        else return ch + search1(str.substring(1));
    }

}
