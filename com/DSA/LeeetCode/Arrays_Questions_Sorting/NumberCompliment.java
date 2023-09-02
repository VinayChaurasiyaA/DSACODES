package LeeetCode;

public class NumberCompliment {
    public static void main(String[] args) {
        System.out.println(w(5));

    }
    static int w(int num){
        int n = 0;
        while (n < num) {
            n = (n << 1) | 1;
        }
        return n - num;
    }

}
