class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] ascArr = new int[128];
        int[] ascArr2 = new int[128];

        for (int i = 0; i < s.length(); i++) {
            if (ascArr[s.charAt(i)] != ascArr2[t.charAt(i)]) {
                return false;
            }
            ascArr[s.charAt(i)] = i + 1;
            ascArr2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}