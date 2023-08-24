class Solution {
    public int removeElement(int[] nums, int val) {
        int lastIndex = nums.length - 1;
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
            } else {
                swap(nums, i, lastIndex);
                nums[lastIndex] = -1;
                lastIndex--;
                i--;
            }

            if (i == lastIndex) {
                break;
            }

        }
        return k;
    }

    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}