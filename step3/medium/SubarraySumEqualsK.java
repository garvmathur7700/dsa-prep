// https://leetcode.com/problems/subarray-sum-equals-k/

package step3.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        int k = 3;
        System.out.println("Subarrays with sum K: " + subArraySum(nums, k));
    }

    public static int subArraySum (int[] nums, int k) {
        int count = 0;
        int preSum = 0;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        preSumMap.put(preSum, 1);

        for (int num : nums) {
            preSum += num;

            int remainder = preSum - k;
            count += preSumMap.getOrDefault(remainder, 0);

            preSumMap.put(preSum, preSumMap.getOrDefault(preSum, 0) + 1);
        }

        return count;
    }

    public static int subarraySumBrute (int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}
