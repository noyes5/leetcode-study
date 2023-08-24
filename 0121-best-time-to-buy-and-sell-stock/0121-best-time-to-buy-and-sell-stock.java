class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = 10000 + 1;

        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else {
                if (max < prices[i] - min) {
                    max = prices[i] - min;
                }
            }
        }
        
        return max;
    }
}