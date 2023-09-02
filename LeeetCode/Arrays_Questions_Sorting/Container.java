package LeeetCode;

public class Container {
    public static void main(String[] args) {
        int[] height = {1,2};
        System.out.println(maxArea(height));

    }
    static int maxArea(int[] height) {
        int max = 0;
        int currentmax = 0;
        if(height.length==1||height.length==2){
            currentmax=height[0]-height[1];
            currentmax=Math.abs(currentmax);

        }
        for(int index = 0;index<=height.length;index++){
            for(int indexValue=height.length-1;indexValue>=index+1;indexValue--){
                max = height[0];
                if(indexValue>=index){
                    if(height[index]-height[indexValue]<0){
                        indexValue--;
                        //index++;
                    }
                    max = (indexValue-index)*height[indexValue];
                    currentmax = Math.max(max,currentmax);
                }

            }

        }
        return currentmax;

    }
    public int maxArea1(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right])
                    * (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}
