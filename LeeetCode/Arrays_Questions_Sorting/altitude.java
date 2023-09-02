package LeeetCode;

import java.util.Arrays;

public class altitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(altitudee(gain));
    }
    static int altitudee(int[] gain){
        int height = 0;
        int[] alt = new int[gain.length+1];
        // gain is net of i and i+1;
        //gain =(i+1)-i;
        alt[0]=height;
        for(int i=1;i<=gain.length;i++){
            alt[i]=gain[i-1]+alt[i-1];
        }
        Arrays.sort(alt);
        height=alt[alt.length-1];
//        for(int j:alt){
//            if(alt.length>0){
//                return alt[alt.length-1];
//            }
//        }
        return height;
    }
}
