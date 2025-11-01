// https://takeuforward.org/plus/dsa/problems/longest-subarray-with-sum-k

package step3.easy;

import java.util.HashMap;

public class LongestSubarrayWithSumKNegatives {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 0, 3, -3 };
        int k = 3;

        System.out.println("Longest Subarray with sum " + k + " is of length: " + longestSubarray(nums, k));
    }

    public static int longestSubarray (int[] nums, int k) {
        HashMap<Integer, Integer> preSumMap = new HashMap<>();

        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
}
