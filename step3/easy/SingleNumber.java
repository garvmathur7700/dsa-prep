// https://leetcode.com/problems/single-number/description/

package step3.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 4,1,2,1,2 };
        System.out.println("Single number : " + singleNumber(nums));
        System.out.println("Single number : " + singleNumberXOR(nums));
    }

    // Time Complexity: O(n/2 + 1) or O(M) where M is size of the map
    public static int singleNumber (int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            int key = num;
            int freq = 0;
            if (mp.containsKey(key))
                freq = mp.get(key);
            freq++;
            mp.put(key, freq);
        }

        int ans = -1;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1) {
                ans = entry.getKey();
                break;
            }
        }
        return ans;
    }

    // Time Complexity: O(N)
    public static int singleNumberXOR (int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}
