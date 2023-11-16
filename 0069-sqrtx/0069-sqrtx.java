class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sqrt = x / mid;

            if (mid == sqrt) {
                return mid;
            } 
            if (mid < sqrt) {
                left = mid + 1;
            }
            if (mid > sqrt) {
                right = mid - 1;
            }
        }
        return right;
    }
}