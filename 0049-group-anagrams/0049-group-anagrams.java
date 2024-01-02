class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answers = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if (map.containsKey(sortedString)) {
                int groupIndex = map.get(sortedString);
                List<String> group = answers.get(groupIndex);
                group.add(str);
            } else {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                answers.add(newGroup);
                map.put(sortedString, answers.size() - 1);
            }
        }
        return answers;
    }
}