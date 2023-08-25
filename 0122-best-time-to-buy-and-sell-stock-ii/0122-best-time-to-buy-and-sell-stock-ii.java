class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } 
            if (prices[i + 1] < prices[i]) {
                max += prices[i] - min;
                min = prices[i];
            }
        }

        if (prices[prices.length - 1] > min) {
            max += prices[prices.length - 1] - min;
        }

        return max;
    }
}