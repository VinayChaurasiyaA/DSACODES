package LeeetCode;

public class HamminDistance {
    public static void main(String[] args) {

    }
    static  int d(int x , int y){
        int c = 0;
        int n = x^y;
        for (int i = 0; i <32 ; i++) {
            int w = (n&1);
            if (w==1){
                c+=1;
            }
            n = n>>1;
        }
        return c;
    }
}
