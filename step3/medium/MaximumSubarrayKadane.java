// https://leetcode.com/problems/maximum-subarray/

package step3.medium;

public class MaximumSubarrayKadane {
    public static void main(String[] args) {
        int[] nums = { -2,1,-3,4,-1,2,1,-5,4 };
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }

    public static int maxSubArray (int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;

            if (sum > maxSum) maxSum = sum;

            if (sum < 0) sum = 0;
        }
        return maxSum;
    }
}
