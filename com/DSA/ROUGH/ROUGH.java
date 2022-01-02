package com.DSA.ROUGH;

import java.util.Scanner;

public class ROUGH {
    public static String main(String[] args) {
        int N = 5;
        printNos(N);
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String a = in.next();
        System.out.println("");
        System.out.println("Enter your marks");
        int b = in.nextInt();
        while (b >= 90) {
            System.out.println("a grade");
            break;
        }
        while (b >= 80 && b < 90) {
            System.out.println("b grade");
            break;



        }
        return a;
    }


    static void printNos(int N) {
        if (N <= 0) {
            return;
        } else {
          printNos(N-1);
            System.out.print(" "+ N);

        }
    }


}

