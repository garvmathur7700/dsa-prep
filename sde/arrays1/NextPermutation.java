class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse (nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        reverse (nums, pivot + 1, n - 1);
    }

    private void reverse (int[] nums, int start, int end) {
        int mid = start + (end - start) / 2;

        for (int i = start; i <= mid; i++) {
            int temp = nums[i];
            nums[i] = nums[end];
            nums[end--] = temp;
        }
    }
}
