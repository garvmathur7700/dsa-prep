import java.util.ArrayList;
import java.util.List;

class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int ele2 = Integer.MIN_VALUE;
        int cnt2 = 0;

        for (int num : nums) {
            if (cnt1 == 0 && ele2 != num) {
                ele1 = num;
                cnt1++;
            } else if (cnt2 == 0 && ele1 != num) {
                ele2 = num;
                cnt2++;
            } else if (num == ele1)
                cnt1++;
            else if (num == ele2) 
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for (int num : nums) {
            if (num == ele1) cnt1++;
            if (num == ele2) cnt2++;
        }

        List<Integer> result = new ArrayList<>();
        if (cnt1 > nums.length / 3) result.add(ele1);
        if (cnt2 > nums.length / 3) result.add(ele2);

        return result;
    }
}
