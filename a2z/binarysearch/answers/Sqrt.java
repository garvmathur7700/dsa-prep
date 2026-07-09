package binarysearch.answers;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println("Square root: " + floorSqrt(100000));
    }

    public static int floorSqrt (int x) {
        int left = 0, right = x;

        int ans = 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long square = (long) mid * mid;

            if (square == x)
                return mid;
            else if (x < square)
                right = mid - 1;
            else {
                ans = mid;
                left = mid + 1;
            }
        }

        return ans;
    }
}
