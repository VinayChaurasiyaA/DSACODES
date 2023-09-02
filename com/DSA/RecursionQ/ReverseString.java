package com.DSA.RecursionQ;
//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public static void main(String[] args) {
        String str = "Techie Delight";

        // string is immutable
        str = reverse(str);

        System.out.println("The reverse of the given string is: " + str);
    }
    static void reverse(char[] s, int n){
        int i = 0;
        if (n==s.length) return;
        reverse(s,n+1);
        if(i<=n){
            char temp = s[n];
            s[n] = s[i];
            s[i++]=temp;
        }
    }
    static String reverse(String str){
        if (str==null || str.equals("")){
            return str;
        }
        char[] A = str.toCharArray();
        reverse(A,0);
        return String.copyValueOf(A);
    }

}
