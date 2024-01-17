class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            // red is 0
            for (mid = 0; mid <= high;) {
                if (nums[mid] == 0) {
                    // 0(빨강)을 앞으로 이동
                    swap(nums, low++, mid++);
                } else if (nums[mid] == 1) {
                    // 1(흰색)은 그대로 둠
                    mid++;
                } else if (nums[mid] == 2) {
                    // 2(파랑)을 뒤로 이동
                    swap(nums, mid, high--);
                }
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}