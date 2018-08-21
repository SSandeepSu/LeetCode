package leetCode;

//import helpers.GenericHelper;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        //GenericHelper.printIntArray(twoSum(new int[]{2,7,11,15}, 9));
    }

    //easy solution
    //Runs in O(n^2)
    /*public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    result = new int[]{i,j};
                    break;
                }
            }
        }

        return result;
    }*/

    //HashMap based solution
    //Runs in O(n)
    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                result = new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }

        return result;
    }

    //TODO: Implement sort based solution
}
