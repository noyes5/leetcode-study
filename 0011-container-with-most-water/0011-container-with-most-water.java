class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = Integer.MIN_VALUE;

        while (left < right) {
            int lowHeight = Math.min(height[left], height[right]);
            int curWater = (right - left) * lowHeight;
            if (curWater > maxWater) {
                maxWater = curWater;
            }
            while (left < right && height[left] <= lowHeight) {
                left++;
            } 
            while (left < right && height[right] <= lowHeight) {
                right--;
            }
        }

        return maxWater;
    }
}