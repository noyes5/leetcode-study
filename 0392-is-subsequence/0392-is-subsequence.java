class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;

        if (s.length() == 0) {
            return true;
        }

        for (int i = 0; i < t.length(); i++) {
            char c1 = t.charAt(i);
            char c2 = s.charAt(index);
            
            if (c1 == c2) {
                index++;

                if (index == s.length()) {
                    return true;
                }
            }
        }

        return false;
    }
}