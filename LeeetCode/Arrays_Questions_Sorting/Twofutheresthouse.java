package LeeetCode.Arrays_Questions_Sorting;

public class Twofutheresthouse {
    public static void main(String[] args) {
        int[] a = {4,4,4,11,4,4,11,4,4,4,4,4};
        System.out.println(maxDistance(a));
    }
    static int maxDistance(int[] colors) {
        int i=0,ans=0;
        int j =colors.length-1;
        while(i<j){
            if(colors[i]!=colors[j]){
                //ans = Math.abs(i-j);
                ans = Math.max(ans ,  Math.abs(i-j));
                i++;
                j= colors.length-1;

            }
            else{
                j--;
            }
        }

        return ans;
    }
}
