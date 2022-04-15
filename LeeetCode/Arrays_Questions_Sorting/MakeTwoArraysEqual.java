package LeeetCode;

public class MakeTwoArraysEqual {
    public static void main(String[] args) {
        int[] target = {1,2,2,3};
        int[] arr ={1,1,2,3};
        System.out.println(canBeEqual1(target , arr));
    }
    static boolean canBeEqual(int[] target, int[] arr) {
        int ans = 0;
        for(int i = 0;i<arr.length;i++){

            for(int j = 0;j<target.length;j++){
                if((target[i]^arr[j])==0){
                    ans+=1;
                    break;
                }

            }

        }
        if(ans==arr.length){
            return true;
        }
        return false;
    }
    static boolean canBeEqual1(int[] target, int[] arr) {
        int[] cnt = new int[1001];
        for (int t : target)
            ++cnt[t];
        for (int a : arr) {
            if (--cnt[a] < 0) {
                return false;
            }
        }
        return true;
    }
}
