// https://leetcode.com/problems/majority-element-ii/description/

package step3.hard;

import java.util.*;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 1, 3, 1, 4, 5, 6 };
        System.out.println("Majority Element: " + majEleOptimal(nums));
    }

    public static List<Integer> majorityElement (int[] nums) {
        int n = nums.length/3;
        Map<Integer, Integer> mpp = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int num : nums) {
            int freq = 1;
            if (mpp.containsKey(num)) {
                freq = mpp.get(num);
                freq++;
            }
            mpp.put(num, freq);
            if (freq > n && !resultSet.contains(num)) {
                resultSet.add(num);
                result.add(num);
            }
        }
        return result;
    }

    public static List<Integer> majEleOptimal (int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && el2 != nums[i]) {
                count1 = 1;
                el1 = nums[i];
            } else if (count2 == 0 && el1 != nums[i]) {
                count2 = 1;
                el2 = nums[i];
            } else if (el1 == nums[i]) count1++;
            else if (el2 == nums[i]) count2++;
            else {
                count1--;
                count2--;
            }
        }

        List<Integer> results = new ArrayList<>();
        /**
         * The counters have to be reset because they only indicate the final candidates in the Moore's Voting Algorithm.
         */
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (el1 == nums[i]) count1++;
            if (el2 == nums[i]) count2++;
        }

        if (count1 > nums.length / 3) results.add(el1);
        if (count2 > nums.length / 3) results.add(el2);

        return results;
    }
}
