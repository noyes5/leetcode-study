import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;

        int right = 1;

        if (s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            char c = s.charAt(i);
            map.put(c, 1);
            right = i + 1;

            while (right <= s.length() - 1) {
                char c3 = s.charAt(right);
                map.put(c3, map.getOrDefault(c3, 0) + 1);
                right++;

                if (map.get(c3) == 2) {
                    i = s.indexOf(c3, i);

                    if (max < map.size()) {
                        max = map.size();
                    }
                    break;
                }
            }
            if (max < map.size()) {
                max = map.size();
            }
        }

        return max;
        
    }
}