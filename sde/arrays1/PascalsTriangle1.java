package arrays1;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        // if i == 0 or i == numberOfElementsInRow, then element = 1
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    row.add(1);
                else {
                    int sum = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    row.add(sum);
                }
            }
            
        result.add(row);
        }

        return result;
    }
}

