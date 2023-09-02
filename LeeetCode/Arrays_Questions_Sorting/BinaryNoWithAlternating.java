package LeeetCode;

public class BinaryNoWithAlternating {
    public static void main(String[] args) {
        System.out.println(alter(7));

    }
    static boolean alter(int n){
             String bits = Integer.toBinaryString(n);
                for (int i = 0; i < bits.length() - 1; i++) {
                    if (bits.charAt(i) == bits.charAt(i+1)) {
                        return false;
                    }
                }
                return true;
            }
    static boolean later1(int n){
        int cur = n%2;
        n = n/2;
        while (n!=0){
            if (cur == n%2){
                return false;
            }
            cur = n%2;
            n/=2;
        }
        return true;

    }

}
