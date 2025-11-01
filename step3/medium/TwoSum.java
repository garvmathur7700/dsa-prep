package step3.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 0, 3, 5, 2 };
        int target = 8;
        System.out.println("Target sum indices are at " + Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum (int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (mpp.containsKey(remainder)) {
                return new int[] { mpp.get(remainder), i };
            }
            mpp.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    // This approach is optimal if we have to return a boolean
    public static int[] twoSumOptimal (int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum > target)
                right--;
            else if (sum < target)
                left++;
            else
                return new int[] { left, right };
        }
        return new int[] { -1, -1 };
    }
}
