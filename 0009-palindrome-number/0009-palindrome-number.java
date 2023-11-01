class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int copyX = x;
        int reversedX = 0;
        while (copyX > 0) {
            int digit = copyX % 10;
            reversedX = reversedX * 10 + digit;
            copyX /= 10;
        }

        return x == reversedX;    
    }
}