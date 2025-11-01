package step3.medium;

import java.util.Set;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = { 9,1,4,7,3,-1,0,5,8,-1,6 };
        System.out.println("Longest Sequence: " + longestConsecutive(nums));
    }

    public static int longestConsecutive (int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums)
            numSet.add(num);

        int longest = 1;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int count = 1;
                int x = num;
                while (numSet.contains(x + 1)) {
                    count++;
                    x = x + 1;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
