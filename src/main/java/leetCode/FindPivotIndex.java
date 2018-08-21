package leetCode;

public class FindPivotIndex {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    public static int pivotIndex(int[] nums) {
        int leftSum = 0, sum = 0;
        for(int num: nums) sum += num;
        for(int i = 0; i < nums.length; i++) {
            if(leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }

}
