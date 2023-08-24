import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k %= size;

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = nums[size - k + i];
        }
 
        for (int i = size - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
 
        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
    }
}