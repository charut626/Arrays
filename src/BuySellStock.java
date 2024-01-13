public class BuySellStock {
    static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0; // No profit if there are less than two days or no prices provided
        }
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
//            Update the minimum price if the current price is lower
            minPrice = Math.min(minPrice, currentPrice);
//            Calculate the potential profit if selling at the current price
            int potentialProfit = currentPrice - minPrice;
//            Update the maximum profit if the potential profit is higher
            maxProfit = Math.max(maxProfit, potentialProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
