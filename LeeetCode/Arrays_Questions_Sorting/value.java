package LeeetCode;

import java.util.Arrays;

public class value {
    public static void main(String[] args) {
        int[] alice={2};
        int[] bob={1,3};
        System.out.println(Arrays.toString(fairCandySwap(alice, bob)));
    }
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       // int[] ans = arr{-1,-1};
        //i where alice exchange
        //j where bob must exchange

        for(int alice =0;alice<aliceSizes.length;alice++){
            for(int bob = 0;bob<bobSizes.length;bob++){
                swap(alice , bob , aliceSizes , bobSizes);


                    int sumalice=0;
                    int sumbob=0;
                    for (int i: aliceSizes ){
                        sumalice+=i;
                    }
                    for(int j:bobSizes){
                        sumbob+=j;
                    }
                if(sumalice == sumbob){
                    return new int[]{aliceSizes[alice],bobSizes[bob]};
                }


            }
        }
        return new  int[]{-1,-1};

    }
    static void swap(int i , int j , int[] alice , int[] bob){
        int temp = bob[j];
        bob[j]=alice[i];
        alice[i]=temp;
    }
    //for solution
    static int[] fairCandySwap1(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        for (int i = 0; i < A.length; i++)
            sumA += A[i];
        for (int i = 0; i < B.length; i++)
            sumB += B[i];
        int dif = (sumA - sumB) / 2;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] - B[j] == dif)
                    return new int[]{A[i], B[j]};
            }
        }
        return null;
    }
}
