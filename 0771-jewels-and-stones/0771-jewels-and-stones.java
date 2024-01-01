class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Boolean> jewelMap = new HashMap<>();
        int count = 0;
        for (char jewel : jewels.toCharArray()) {
            jewelMap.put(jewel, true);
        }

        for (char stone : stones.toCharArray()) {
            if (jewelMap.containsKey(stone)) {
                count++;
            }
        }

        return count;
    }
}