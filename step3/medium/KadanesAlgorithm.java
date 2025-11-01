// https://takeuforward.org/plus/dsa/problems/kadane's-algorithm

package step3.medium;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        System.out.println("Max sum using Kadane's Algorithm: " + kadaneMaxSubArray(nums));
    }

    public static int kadaneMaxSubArray (int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            if (sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }

        return maxSum;
    }
}
