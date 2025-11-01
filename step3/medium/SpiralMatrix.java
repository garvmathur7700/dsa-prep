// https://leetcode.com/problems/spiral-matrix/

package step3.medium;

import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("Matrix in spiral order: " + spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int a = 0;
        int b = 0;
        int c = matrix[0].length - 1;
        int d = matrix.length - 1;

        List<Integer> result = new ArrayList<>();

        while (a <= c && b <= d) {
            // Traverse right along top row
            for (int i = a; i <= c; i++) {
                result.add(matrix[b][i]);
            }
            b++;

            // Traverse down along right column
            for (int j = b; j <= d; j++) {
                result.add(matrix[j][c]);
            }
            c--;

            // Traverse left along bottom row (only if there's a valid row)
            if (b <= d) {
                for (int k = c; k >= a; k--) {
                    result.add(matrix[d][k]);
                }
                d--;
            }

            // Traverse up along left column (only if there's a valid column)
            if (a <= c) {
                for (int l = d; l >= b; l--) {
                    result.add(matrix[l][a]);
                }
                a++;
            }
        }

        return result;
    }
}
