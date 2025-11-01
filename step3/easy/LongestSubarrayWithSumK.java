// https://takeuforward.org/plus/dsa/problems/longest-subarray-with-sum-k

/*
Given an array nums of size n and an integer k,
find the length of the longest sub-array that
sums to k. If no such sub-array exists, return 0.
Examples:
Input: nums = [10, 5, 2, 7, 1, 9],  k=15
Output: 4
Explanation:
The longest sub-array with a sum equal to 15 is [5, 2, 7, 1],
which has a length of 4. This sub-array starts at index 1
and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1)
equals 15. Therefore, the length of this sub-array is 4.
Input: nums = [-3, 2, 1], k=6
Output: 0
Explanation:
There is no sub-array in the array that sums to 6. Therefore, the output is 0.
 */

package step3.easy;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = { -2, 0, 0, 3 };
        int target = 1;

        System.out.println("Longest Subarray with target sum: " + longestSubarray(nums, target));
    }

    public static int longestSubarray (int[] nums, int k) {
        int left = 0;
        int right = 0;
        long sum = nums[0];
        int maxLength = 0;

        while (right < nums.length) {
            while (sum > k && left <= right) {
                sum -= nums[left];
                left++;
            }

            if (sum == k)
                maxLength = Math.max(maxLength, right - left + 1);

            right++;
            if (right < nums.length)
                sum += nums[right];
        }
        return maxLength;
    }
}
