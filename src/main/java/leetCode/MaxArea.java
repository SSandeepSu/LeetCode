package leetCode;

public class MaxArea {

    public static void main(String[] args) {

    }

    public static int maxArea(int[] height){
        int l = 0, r = height.length - 1, maxArea = 0;

        while (l < r){
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r-l));
            if(height[l] < height[r]) l++;
            else r--;
        }

        return maxArea;
    }

}
