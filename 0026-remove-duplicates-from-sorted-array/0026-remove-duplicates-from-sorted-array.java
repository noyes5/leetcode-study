class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int idx = 0;
        int size = nums.length;
        boolean isDuplicated = false;

        for (int i = 1; i < size; i++) {
            int num = nums[idx];
            if (nums[i] == num && !isDuplicated) {
                isDuplicated = true;
                nums[idx] = num;

            } else if (nums[i] != num) {
                isDuplicated = false;
                nums[++idx] = nums[i];
            }
        }
        return k = idx + 1;
    }
}