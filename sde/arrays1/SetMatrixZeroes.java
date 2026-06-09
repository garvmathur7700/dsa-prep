class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        // first column = row's tally
            // matrix[i][0]
        // first row = column's tally
            // matrix[0][j]
        // col0 = column 0's tally
        int col0 = 1;

        // traverse from [0,0] - [m, n] and tally 0s
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (j == 0)
                        col0 = 0;
                    else {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        // traverse from [1,1] - [m,n] and mark 0s acc. to tally
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0)
                        matrix[i][j] = 0;
                }
            }
        }

        // if [0,0] = 0 then first row is 0
        if (matrix[0][0] == 0) {
            for (int i = 0; i < n; i++) 
                matrix[0][i] = 0;
        }

        // if col0 = 0, then first column in 0
        if (col0 == 0) {
            for (int i = 0; i < m; i++) 
                matrix[i][0] = 0;
        }
    }
}

