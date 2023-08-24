class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int inputIdx = m + n - 1;

        for (int i = inputIdx; i >= 0; i--) {
            if (m > 0 && (n <= 0 || nums1[m - 1] > nums2[n - 1])) {
                nums1[inputIdx] = nums1[m - 1];
                m--;
            } else {
                nums1[inputIdx] = nums2[n - 1];
                n--;
            }
            inputIdx--;
        }
    }
}