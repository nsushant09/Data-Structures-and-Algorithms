package array_and_hashing;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexValue.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (indexValue.containsKey(remainder)) {
                int secondIndex = indexValue.get(remainder);
                if(secondIndex != i){
                    return new int[]{i, secondIndex};
                }
            }
        }

        return new int[]{0,0};
    }
}
