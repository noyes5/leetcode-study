class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char data = ransomNote.charAt(i);
            ransomMap.put(data, ransomMap.getOrDefault(data, 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char data = magazine.charAt(i);
            magazineMap.put(data, magazineMap.getOrDefault(data, 0) + 1);
        }

        if (ransomMap.size() > magazineMap.size()) {
            return false;
        }

        for (Map.Entry<Character, Integer> entry : ransomMap.entrySet()) {
            if (magazineMap.get(entry.getKey()) == null || entry.getValue() > magazineMap.get(entry.getKey())) {
                return false;
            }
        } 
        return true;
    }
}