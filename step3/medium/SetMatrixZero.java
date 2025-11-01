// https://leetcode.com/problems/set-matrix-zeroes/description/

package step3.medium;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] nums = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        System.out.println("Matrix before: ");
        printMatrix(nums);
        setZeroes(new int[][] {{0}});
        System.out.println("Matrix after: ");
        printMatrix(nums);
    }

    public static void setZeroes(int[][] nums) {
        // row[] -> nums[..][0]
        // col[] -> nums[0][..]
        int col0 = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == 0) {
                    nums[i][0] = 0;
                    if (j != 0)
                        nums[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < nums[0].length; j++) {
                if (nums[i][j] != 0) {
                    if (nums[i][0] == 0 || nums[0][j] == 0)
                        nums[i][j] = 0;
                }
            }
        }

        if (nums[0][0] == 0 ) {
            for (int i = 0; i < nums[0].length; i++)
                nums[0][i] = 0;
        }

        if (col0 == 0) {
            for (int j = 0; j < nums.length; j++)
                nums[j][0] = 0;
        }
    }

    public static void printMatrix (int[][] nums) {
        for (int[] num : nums) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(num[j] + " ");
            }
            System.out.println();
        }
    }

/*    public static void setZeroes(int[][] nums) {
        int[] col = new int[nums[0].length];
        int[] row = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    nums[i][j] = 0;
                }
            }
        }
    }*/


    /*
    // This solution has time complexity of O( M x N x ( M + N ) )
    public static void setZeroes(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == 0) {
                    for (int a = 0; a < nums.length; a++) {
                        if (nums[a][j] == 0) continue;
                        nums[a][j] = Integer.MIN_VALUE;
                    }
                    for (int b = 0; b < nums[0].length; b++) {
                        if (nums[i][b] == 0) continue;
                        nums[i][b] = Integer.MIN_VALUE;
                    }
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == Integer.MIN_VALUE)
                    nums[i][j] = 0;
            }
        }
    }
     */
}
