class Solution {
    public int jump(int[] nums) {
        int nowMaxReach = 0;
        int nextReach = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            nowMaxReach = Math.max(nowMaxReach, i + nums[i]);

            if (i == nextReach) {
                ++count;
                nextReach = nowMaxReach;
            }
        }
        return count;
    }
}