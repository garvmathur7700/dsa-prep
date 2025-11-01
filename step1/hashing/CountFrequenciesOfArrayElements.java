// https://takeuforward.org/plus/dsa/problems/counting-frequencies-of-array-elements

/*
Given an array nums of size n which may contain duplicate elements,
return a list of pairs where each pair contains a unique
element from the array and its frequency in the array.
You may return the result in any order, but each element must appear
exactly once in the output.
Examples:
Input: nums = [1, 2, 2, 1, 3]
Output: [[1, 2], [2, 2], [3, 1]]
Explanation:
- 1 appears 2 times
- 2 appears 2 times
- 3 appears 1 time
Order of output can vary.
Input: nums = [5, 5, 5, 5]
Output: [[5, 4]]
Explanation:
- 5 appears 4 times.
 */

package step1.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequenciesOfArrayElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1};
        System.out.println(countFrequencies(nums));
    }

    public static List<List<Integer>> countFrequencies (int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            int key = num;
            int freq = 0;
            if (mp.containsKey(key))
                freq = mp.get(key);
            freq++;
            mp.put(key, freq);
        }

        List<List<Integer>> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            List<Integer> entryList = new ArrayList<>();
            entryList.add(entry.getKey());
            entryList.add(entry.getValue());
            list.add(entryList);
        }

        return list;
    }
}
