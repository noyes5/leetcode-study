class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int totalWater = 0;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax < rightMax) {
                totalWater += leftMax - height[left++];
            } else {
                totalWater += rightMax - height[right--];
            }
        }

        return totalWater;
    }
}