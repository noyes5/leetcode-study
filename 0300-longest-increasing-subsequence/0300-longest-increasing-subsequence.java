class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int len = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] > dp[len - 1]) {
                dp[len++] = nums[i];
            } else {
                int idx = binarySearch(dp, 0, len - 1, nums[i]);
                dp[idx] = nums[i];
            }
        }
        return len;
    }

    private int binarySearch(int[] dp, int left, int right, int target) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (dp[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}