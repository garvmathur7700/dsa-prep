// https://leetcode.com/problems/missing-number/description/

package step3.easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4, 5 };
        System.out.println("Missing Number in range 0 to n (both inclusive): " + missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int num : nums) {
            arrSum += num;
        }
        return sum - arrSum;
    }
}
