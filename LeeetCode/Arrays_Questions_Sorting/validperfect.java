package LeeetCode;

public class validperfect {
    public static void main(String[] args) {
        int nums =
                2147483647;
        System.out.println(withbs(nums));

    }
    static boolean isperfect(int num){
        if (num == 1){
            return  true;
        }
        for (int i = 2; i*i <=num ; i++) {
            if ((i*i)==num){
                return true;
            }
        }
        return false;
    }
    static boolean withbs(int num){
        if(num == 1){
            return true;
        }
        int start = 2;
        int end = num;
        while (start<=end){
            int mid = start + ( end -start)/2;
            if (mid*mid==num){
                return true;
            }
            if (mid *mid>num){
                end = mid-1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}
