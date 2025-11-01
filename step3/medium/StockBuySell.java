// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

package step3.medium;

public class StockBuySell {
    public static void main(String[] args) {
        int[] nums = { 7,1,5,3,6,4 };
        System.out.println("Maximum Profit: " + maxProfit(nums));
    }

    public static int maxProfit (int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
