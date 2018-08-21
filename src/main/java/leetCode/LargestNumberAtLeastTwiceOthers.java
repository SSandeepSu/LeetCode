package leetCode;

public class LargestNumberAtLeastTwiceOthers {

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{1,2,3,6,1,2}));
    }

    public static int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int largestIndex=0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                largestIndex = i;
            }
        }

        for(int i : nums){
            if(i != max && 2 * i > max){
                return -1;
            }
        }

        return largestIndex;
    }
}
