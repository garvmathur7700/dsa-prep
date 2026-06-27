class MajorityElement1 {
    public int majorityElement(int[] nums) {
        int element = Integer.MIN_VALUE;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                element = num;
                count++;
            }
            else if (num == element)
                count++;
        }

        return element;
    }
}
