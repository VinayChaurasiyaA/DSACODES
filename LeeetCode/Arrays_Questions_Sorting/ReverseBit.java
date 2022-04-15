package LeeetCode;
//Wait for the understanding
public class ReverseBit {
    public static void main(String[] args) {
        System.out.println(reverseBits(1001010));
        System.out.println(reveserbit1(1001010));
    }
    static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }
    static int reveserbit1(int n){
        int c = 0;
        for (int i = 0; i <32 ; i++) {
            int x =n&1;
            c = c+n;
            n=n>>1;

        }
        return c;
    }
}
