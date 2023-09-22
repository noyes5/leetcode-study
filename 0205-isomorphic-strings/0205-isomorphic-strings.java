class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.get(c) == null) {
                map.put(c, c2);
                
                if (map.size() != map.values().stream()
                .distinct()
                .collect(Collectors.toList())
                .size()) {
                    return false;
                }
            } else if (map.get(c) != c2) {
                return false;
            }
        }
        return true;
    }
}