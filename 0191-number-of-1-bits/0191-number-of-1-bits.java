public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int countNumberOne = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                countNumberOne++;
            }
            n = n >> 1;
        }
        return countNumberOne;
    }
}