package LeeetCode;

public class poweroftwo {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(isower(n));

    }
    static boolean isower(int n){
        if (n==1){
            return true;
        }else if(n%2!=0||n==0) {
            return false;
        }
        return isower(n/2);
    }
}
