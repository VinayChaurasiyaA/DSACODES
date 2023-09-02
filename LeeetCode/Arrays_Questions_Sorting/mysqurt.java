package LeeetCode;

public class mysqurt {
    public static void main(String[] args) {
        int nums = 8;
        System.out.println(sqt(nums));
    }
    static  int sqt(int nums){
       int x = (int) Math.sqrt(8);

//        for (int i = 1; i*i <nums ; i++) {
//            if (nums%i==0){
//                return i;
//            }
//            else {
//                i++;
//            }
//        }
//        return -1;
        return x;
    }
}
