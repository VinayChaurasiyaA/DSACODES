package LeeetCode;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(stairs(40));
    }
    static int stairs(int n){
        // bAse case;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return stairs(n - 1) +stairs(n - 2);
    }
}
