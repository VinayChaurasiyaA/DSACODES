package LeeetCode.Arrays_Questions_Sorting;

public class Canputflower {
    public static void main(String[] args) {
        int[] nums = {1,0,0,0,0,0,1};
        System.out.println(canPlaceFlowers2(nums , 2));
    }

    public boolean canPlaceFlowers1(int[] flowerbed, int n) {
        int count1 = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                count1++;
            }
        }
        int ans = n;
        if (Math.abs(2 * ans) == (flowerbed.length - count1)) {
            return true;
        }
        return false;
    }

    static boolean canPlaceFlowers(int[] nums, int n) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                i += 2;
                if (i <= nums.length) {
                    if (nums[i] != 1) {
                        //check right and left;
                        if (nums[i - 1] == 0 && nums[i + 1] == 0) {
                            count++;
                            if (count == n) {
                                return true;
                            }
                        }
                    }
                }
            }
        }


        return false;


    }



    static boolean canPlaceFlowers2(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty.
            if (flowerbed[i] == 0) {
                // Check if the left and right plots are empty.
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // If both plots are empty, we can plant a flower here.
                if (emptyLeftPlot && emptyRightPlot) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}




