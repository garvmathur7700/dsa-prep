class StockBuyAndSell {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int lowestPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            lowestPrice = Math.min(prices[i], lowestPrice);
            int profit = prices[i] - lowestPrice;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}

