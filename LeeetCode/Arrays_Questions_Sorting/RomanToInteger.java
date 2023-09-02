package LeeetCode;

public class RomanToInteger {
    public static void main(String[] args) {
        String s =
                "MCMXCIV";
        System.out.println(romanTOINT(s));

    }
    static int romanTOINT(String s){
        int ans = 0;
        //char ch = s.charAt(0);

        while (s.length()!=0){
            if (s.length()>0&&s.charAt(0)=='I'){
                ans = ans + 1;
                s = s.substring(1);
            }
            if (s.length()>0&&s.charAt(0)=='V'){
                ans = ans + 5;
                s = s.substring(1);
            }if (s.length()>0&&s.charAt(0)=='X'){
                ans = ans + 10;
                s = s.substring(1);
            }if (s.length()>0&&s.charAt(0)=='L'){
                ans = ans + 50;
                s = s.substring(1);
            }if (s.length()>0&&s.charAt(0)=='C'){
                ans = ans + 100;
                s = s.substring(1);
            }if (s.length()>0&&s.charAt(0)=='D'){
                ans = ans + 500;
                s = s.substring(1);
            }if (s.length()>0&&s.charAt(0)=='M'){
                ans = ans + 1000;
                s = s.substring(1);
            }
        }
        return ans;


    }
    //Previously i was forgetting that if the combiation of the less value (I) to higher value it will lead to subtaction
    //of the interation so its better to itterate from last index if the next int is less than the previous one which
    //added it will consider in itself;
    public int romanToInt(String S) {
        int ans = 0, num = 0;
        for (int i = S.length()-1; i >= 0; i--) {
            switch(S.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }


}
