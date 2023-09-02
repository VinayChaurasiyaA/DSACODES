package LeeetCode.Arrays_Questions_Sorting;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    static boolean isHappy(int n) {
        int slow = n;
        int fast = ans(n);
        while(fast != 1 && slow !=fast){
            slow = ans(slow);
            fast = ans(fast);
        }
        return fast ==1;

    }
    static int ans(int n){
        int toatal =0;
        while(n>0){
            int d = n%10;
            n/=10;
            toatal += d*d;
        }
        return toatal;
    }
}
