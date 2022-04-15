package LeeetCode;

public class kthmissing {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,11};
        System.out.println(miff(arr , 5));
    }
        static int miff(int[] A , int k){
        int l = 0;
        int r = A.length;
        while (l < r) {
            int m = l+ (r-l)/ 2;
            if (A[m] - 1 - m < k)
                l = m + 1;
            else
                r = m;
        }
        return l + k;

    }

}
