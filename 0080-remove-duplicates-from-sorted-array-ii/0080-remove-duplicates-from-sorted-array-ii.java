class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        boolean isDuplicated = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                isDuplicated = false;
                nums[k] = nums[i];
                k++;
            } else if (nums[i] == nums[i - 1] && !isDuplicated) {
                isDuplicated = true;
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}