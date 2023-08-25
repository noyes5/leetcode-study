class Solution {
    public boolean canJump(int[] nums) {
        int reach = nums.length - 1;

        for (int i = reach; i >= 0; i--) {
            if (i + nums[i] >= reach) {
                reach = i;
            }

            if (reach == 0) {
                return true;
            }    
        }
        return false;
    }
}