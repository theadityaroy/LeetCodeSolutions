// 121. Best Time to Buy and Sell Stock II : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i-1] < prices[i]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}

// Time Complexity : O(N)