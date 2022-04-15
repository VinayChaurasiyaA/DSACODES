package LeeetCode;

import java.util.Arrays;

public class validAnagram {
    public static void main(String[] args) {
        System.out.println(is("abbc","acbb"));
    }
    static  boolean is(String s , String t){
        //if (s.length()!=t.length()) return false;
        if(s.length()!=t.length()){
            return false;
        }
        int[] ans = new int[26];
        for(int i=0;i<s.length();i++){
            ans[s.charAt(i)-'a']++;
            ans[t.charAt(i)-'a']--;
        }
        for(int i:ans){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
