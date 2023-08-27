class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int arraySum = 0;
        int left = 0;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            arraySum += nums[i];
            
            while (arraySum >= target) {
                right = i;
                arraySum -= nums[left];
                min = Math.min(min, right - left + 1);
                left++;
            }

        }

        if (left == 0) {
            return 0;
        }

        return min;
    }
}