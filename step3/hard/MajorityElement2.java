// https://leetcode.com/problems/majority-element-ii/description/

package step3.hard;

import java.util.*;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] nums = { 2, 2 };
        System.out.println("Majority Element: " + majorityElement(nums));
    }

    public static List<Integer> majorityElement (int[] nums) {
        int n = nums.length / 3;
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
}
