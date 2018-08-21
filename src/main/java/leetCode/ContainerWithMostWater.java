package leetCode;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1, maxArea = 0;

        while (l < r){
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r-l));
            if(height[l] < height[r]) l++;
            else r--;
        }

        return maxArea;

    }

}
