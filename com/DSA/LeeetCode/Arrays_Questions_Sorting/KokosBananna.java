package LeeetCode;

public class KokosBananna {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        System.out.println(minEatingSpeed(piles, 8));
    }


        static int minEatingSpeed(int[] piles, int h) {
            // Start at an eating speed of 1.
            int speed = 1;
            int maxvalue=0;
            for(int max = 0;max<piles.length;max++){
                maxvalue = Math.max(piles[max],piles[max+1]);
            }
            int endPoint = maxvalue;

            while (true) {
                int mid = speed+(endPoint-speed)/2;
                // hourSpent stands for the total hour Koko spends with
                // the given eating speed.
                int hourSpent = 0;

                // Iterate over the piles and calculate hourSpent.
                // We increase the hourSpent by ceil(pile / speed)
                for (int pile : piles) {
                    hourSpent += Math.ceil((double) pile/speed);
                    if (hourSpent > h) {
                        break;

                    }
                }

                // Check if Koko can finish all the piles within h hours,
                // If so, return speed. Otherwise, let speed increment by
                // 1 and repeat the previous iteration.
                if (hourSpent <= h) {
                    return speed;
                } else {
                    speed+=1;

                }
            }
        }

}

