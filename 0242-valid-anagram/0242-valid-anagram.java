class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];

        for (char data : t.toCharArray()) {
            arr[data - 'a']++;
        }

        for (char data2 : s.toCharArray()) {
            if (!(arr[data2 - 'a'] > 0)) {
                return false;
            }

            arr[data2 - 'a']--;
        }



        return true;

    }
}