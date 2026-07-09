package binarysearch.answers;

// https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1

public class NthRoot {
    public static void main(String[] args) {
        System.out.println("Nth root: " + nthRoot(3, 27));
    }

    public static int nthRoot(int N, int M) {
        int left = 0, right = M;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long nthPower = pow(mid, N);

            if (nthPower == M)
                return mid;
            else if (nthPower < M) {
                left = mid + 1;
            }
            else
                right = mid - 1;
        }

        return -1;
    }

    private static long pow(int m, int n) {
        long ans = m;
        for (int i = 1; i < n; i++)
            ans *= m;

        return ans;
    }
}
