/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/

package Arrays;

public class MaxProfit {
    public static int maxProfit(int prices[]){
        int maxProfit = 0;
        int minStockValue = Integer.MAX_VALUE;
        int start = 0;
        int end = prices.length;
        while(start < end){
            if(prices[start] < minStockValue) minStockValue = prices[start];
            if(prices[start] > minStockValue){
                int profit = prices[start] - minStockValue;
                maxProfit = Math.max(maxProfit, profit);
            }
            start++;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println(profit);
    }
    
}
