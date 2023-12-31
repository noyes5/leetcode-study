class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1 || s.equals(new StringBuilder(s).reverse().toString())) {
            return s;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int maxOddLen = getPalindromLength(s, i, i);
            int maxEvenLen = getPalindromLength(s, i, i + 1);
            int len = Math.max(maxOddLen, maxEvenLen);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }            
        }

        return s.substring(start, end + 1);
    }

    private int getPalindromLength(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}