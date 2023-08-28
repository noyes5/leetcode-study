class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            if (!map.containsKey(c) || map.get(c) < left) {
                map.put(c, right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = map.get(c) + 1;
                map.put(c, right);
            }
        }
        
        return maxLength;
    }
}
