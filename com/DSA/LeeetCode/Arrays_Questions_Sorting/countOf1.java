package LeeetCode;

public class countOf1{
    public static void main(String[] args) {
        int n = 00000000000000000000000000011011;
        System.out.println(count1(n));
    }
    static int count(int n){
        int c = 0;
        while (n>0){
            int rem =n%10;
            int x = (rem&1);
            if (x==1){
                c+=1;
            }
            n=n/10;
        }
        return c;
    }
    static int count1(int n ){

        int c = 0;
        for (int i = 0; i <32 ; i++) {
            int x = (n&1);
            if (x==1){
                c+=1;
            }
            n = n>>1;
        }
        return c;
    }


}
