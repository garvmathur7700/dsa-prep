import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 2, -1, -2, -4 };
        System.out.println("Distinct triplets: " + sum(nums));
        System.out.println("Distinct triplets: " + threeSum(nums));
        System.out.println("Distinct triplets: " + threeBetterSum(nums));
    }

    public static List<List<Integer>> sum (int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ans;
    }

    public static List<List<Integer>> threeSum (int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
          for (int j = i + 1; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
              if (nums[i] + nums[j] + nums[k] == 0) {
                List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                temp.sort(null);
                st.add(temp);
              }
            }
          }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    public static List<List<Integer>> threeBetterSum (int[] nums) {
        Set<List<Integer>> ansSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> st = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int lookFor = - (nums[i] + nums[j]);
                if (st.contains(lookFor)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], lookFor);
                    temp.sort(null);
                    ansSet.add(temp);
                }
                st.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(ansSet);
        return ans;
    } 
}
