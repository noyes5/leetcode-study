class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        char c = needle.charAt(0);

        for (int j = 0; j < haystack.length(); j++) {
            if (j + needle.length() <= haystack.length() && c == haystack.charAt(j)) {
                String cut = haystack.substring(j, j + needle.length());

                if (cut.equals(needle)) {
                    index = j;
                    break;
                } else {
                    continue;
                }
            }
        }
        return index;
    }
}