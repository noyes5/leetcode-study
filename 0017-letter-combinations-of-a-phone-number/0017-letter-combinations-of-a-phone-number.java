class Solution {
    public static String[] phoneLetters = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();
        if (digits.length() == 0) { 
            return answer;
        }
        combine(answer, digits, "", 0);
        return answer;
    }

    public void combine(List<String> answer, String digits, String cur, int index) {
        if (index == digits.length()) {
            answer.add(cur);
            return;
        }

        String letters = phoneLetters[digits.charAt(index) - '1'];

        for (char letter : letters.toCharArray()) {
            combine(answer, digits, cur + letter, index + 1);
        }
    }
}