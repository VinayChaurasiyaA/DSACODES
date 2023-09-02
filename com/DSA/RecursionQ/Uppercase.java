package com.DSA.RecursionQ;

public class Uppercase {
    public static void main(String[] args) {
        String str = "geeksforeeks";
        char result = Firstuppercase(str);
        if (result != 0){
            System.out.println(result);
        }else {
            System.out.println("no uppercase");
        }

    }
    static char Firstuppercase(String str){
        for (int i = 1; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                return str.charAt(i);
            }
        }
        return 0;
    }
}
