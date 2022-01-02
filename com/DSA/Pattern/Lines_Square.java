package com.DSA.Pattern;

public class Lines_Square {

    public static void main(String[] args) {
      // pattern(5);
      //  pattenr1(5);
       // patternParallelbar(4);
       // pattern_square(4);
        plus(5);
        cross(5);
        square(5);
        no_show(4);
    }
    static void pattern(int n){
        for (int row=1;row<=n;row++){
            for (int cols=1;cols<=row;cols++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
    static void pattenr1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int cols = row; cols <=n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternParallelbar(int n){
        for (int row = 0; row <=n ; row++) {
            for (int cols = 0; cols <=n ; cols++) {
                if (cols ==1 || cols ==n ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
   }
    static void plus(int n){

            for (int row = 1; row <=n ; row++) {
                for (int cols = 1; cols <=n ; cols++) {
                    if (row ==n/2 +1 || cols ==n/2 +1 ){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }
    static void pattern_square(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void cross(int n){

        for (int row = 1; row <=n ; row++) {
            for (int cols = 1; cols <=n ; cols++) {
                if (row ==cols || row+cols ==n+1 ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void square(int n){
        for (int row = 1; row <=n ; row++) {
            for (int cols = 1; cols <=n ; cols++) {
                if (row ==1 || cols ==1|| cols ==n || row==n ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void no_show(int n){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }


}
