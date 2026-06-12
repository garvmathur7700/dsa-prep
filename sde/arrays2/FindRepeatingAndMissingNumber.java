/*
 * Given an integer array nums of size n containing values from [1, n] and each value appears exactly once in the array, except for A, which appears twice and B which is missing.  
 * Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.  
 * Note: You are not allowed to modify the original array.  
 * Example 1 
 * Input: nums = [3, 5, 4, 1, 1] 
 * Output: [1, 2] 
 * Explanation: 1 appears two times in the array and 2 is missing from nums 
 *
 * Example 2 
 * Input: nums = [1, 2, 3, 6, 7, 5, 7] 
 * Output: [7, 4] 
 * Explanation: 7 appears two times in the array and 4 is missing from nums.
*/

// https://takeuforward.org/plus/dsa/problems/find-the-repeating-and-missing-number?source=strivers-sde-sheet

import java.util.*;

class FindRepeatingAndMissingNumber {
	public static int[] findRepeatingAndMissingNumber(int[] nums) {
		int n = nums.length;

		int sum = Arrays.stream(nums).sum();
		int sumNatural = (n * (n + 1)) / 2;

		int sumSquare = Arrays.stream(nums)
					.map(num -> num * num)
					.sum();
		int sumSquareNatural = (n * (n + 1) * (2 * n + 1)) / 6;

		int sumMissingRepeating = (sumSquare - sumSquareNatural) / (sum - sumNatural);

		int repeating = (sumMissingRepeating + (sum - sumNatural)) / 2;
		int missing = sumMissingRepeating - repeating;

		return new int[]{repeating, missing};
	}

	public static void main(String[] argv) {	
		System.out.println(Arrays.toString(findRepeatingAndMissingNumber(new int[]{1, 2, 2, 3, 4})));
	}
}
