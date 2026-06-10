class RotateMatrixBy90 {
    public void rotate(int[][] matrix) {
        // Step 1: Transpose
        transpose(matrix);

        // Step 2: Reverse rows
        reverseRows(matrix);
    }

    private void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                if (i == j) continue;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private void reverseRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            reverse (matrix[i], 0, matrix[i].length - 1);
        }
    }

    private void reverse (int[] nums, int start, int end) {
        int mid = start + (end - start) / 2;

        for (int i = 0; i <= mid; i++) {
            int temp = nums[i];
            nums[i] = nums[end];
            nums[end--] = temp;
        }
    }
}
