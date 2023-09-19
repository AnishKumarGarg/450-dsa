// You are given an pricesay prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class stocks {
    static int maxProfit(int[] arr) {
        int maxprofit = 0; // Initialize max profit to 0
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j] - arr[i];
                if (profit > maxprofit) {
                    maxprofit = profit; // Update max profit if we find a higher profit
                }
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = { 7,6,4,3,1 };
        System.out.println(maxProfit(prices));
    }
}
