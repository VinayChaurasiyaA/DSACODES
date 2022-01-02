package com.DSA.Pattern;

public class Triangle {
    public static void main(String[] args) {
   //     rightT(5);
    //    reverT(5);
       // hillp(5);
      //  reverseH(5);
      //  complex(5);
//        dianmond(5);
//        nopattern(5);
//        no_inpattern(5);
        patternlast(5);
    }
    static void rightT(int n){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = rows; cols <=n ; cols++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <=rows ; cols++) {
                    System.out.print("*");
                }
            System.out.println();
        }

        }
        static void reverT(int n){
            for (int rows = 1; rows <=n ; rows++) {
                for (int cols =1 ; cols <=rows ; cols++) {
                    System.out.print(" ");
                }
                for (int cols = rows; cols <=n ; cols++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void hillp(int n){
            for (int rows = 1; rows <=n ; rows++) {
                for (int cols = rows; cols <=n ; cols++) {
                    System.out.print(" ");
                }
                for (int cols = 1; cols < rows; cols++) {
                    System.out.print("*");
                }
                for (int cols = 1; cols <=rows ; cols++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void reverseH(int n){
            for (int rows = 1; rows <=n ; rows++) {
                for (int cols = rows; cols <=n ; cols++) {
                    System.out.print(" ");
                }
                for (int cols = 1; cols < rows; cols++) {
                    System.out.print("*");
                }
                for (int cols = 1; cols <=rows ; cols++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void complex(int n){
            for (int rows = 1; rows <= 2*n-1  ; rows++) {
                int totalcols = rows > n ? 2 *n - rows :rows;
                for (int cols = 1; cols <= totalcols ; cols++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        static void dianmond(int n){
            for (int rows = 1; rows <=2*n ; rows++) {
                int totalcols=rows>n?2*n-rows:rows;
                int space =n-totalcols;
                for (int s = 1; s <= space; s++) {
                    System.out.print(" ");
                }
                for (int cols = 1; cols <= totalcols; cols++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        static void nopattern(int n){
            for (int rows = 1; rows <=n ; rows++) {

                int noofsppace = n-rows;
                for (int s = 1; s <=noofsppace ; s++) {
                    System.out.print(" ");
                }
                for (int cols = rows; cols >=1 ; cols--) {
                    System.out.print(cols + " ");
                }
                for (int cols = 2; cols <=rows ; cols++) {
                    System.out.print(cols + " ");
                }
                System.out.println();
            }
        }
        static void no_inpattern(int n){
            for (int rows = 1; rows <=2*n ; rows++) {
                int c = rows >n? 2*n-rows:rows;
                int space = n-c;
                for (int s = 1; s <=space ; s++) {
                    System.out.print(" ");
                }
                for (int cols = c; cols >=1 ; cols--) {
                    System.out.print(cols + "");

                }
                for (int cols = 2; cols <=c ; cols++) {
                    System.out.print(cols + "");

                }
                System.out.println();
            }
        }
        static void patternlast(int n){
        int original = n;
        n = 2*n;

            for (int rows = 0; rows <=n ; rows++) {
                for (int cols = 0; cols <=n ; cols++) {
                    int atindex =original- Math.min(Math.min(rows , cols) , Math.min(n - rows , n-cols));
                    System.out.print(atindex + " ");
                }
                System.out.println();
            }
        }
    
}

