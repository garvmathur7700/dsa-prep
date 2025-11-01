// https://leetcode.com/problems/max-consecutive-ones/description/

package step3.easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println("Max num of ones: " + findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int maxSum = 0;
        for (int num : nums) {
            if (num == 1)
                sum++;
            else
                sum = 0;

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
