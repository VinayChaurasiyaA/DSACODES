package com.DSA.BitwiseOperator;
//Flipping of an image.
//https://leetcode.com/problems/flipping-an-image/
public class Q11 {
    public static void main(String[] args) {
//        int n = 3;
//        int ans = n^1;
//        System.out.println(ans);
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i]^1 ;
                row[i] = row[image[0].length-i-1] ^ 1;
                row[image[0].length - i-1] = temp;

            }

        }
        return image;


    }
}
