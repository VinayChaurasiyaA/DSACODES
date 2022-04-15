package LeeetCode;

public class coinArrange {
    public static void main(String[] args) {
        System.out.println(balance(8));
    }
    static int balance(int n){
        //int indx = 1;


            int j =1;
            while (j>0){
                if(n-j<0){
                    return j-1;
                }else if(n-j>=0){
                    n=n-j;
                }
                j++;

            }

        return 0;
    }
}
