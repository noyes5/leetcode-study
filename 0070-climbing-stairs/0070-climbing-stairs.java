class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] stepSum = new int[n + 1];
        stepSum[1] = 1;
        stepSum[2] = 2;

        return recursive(n, stepSum);
    }

    private int recursive(int n, int[] stepSum) {
        if (stepSum[n] == 0) {
            stepSum[n] = recursive(n - 1, stepSum) + recursive(n - 2, stepSum);
        }
        return stepSum[n];
    }
}