class Solution {
    public String intToRoman(int num) {
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder answer = new StringBuilder();
        int quot = 0;
        for (int i = 0; i < symbols.length; i++) {
            quot = num / values[i];
            num %= values[i];
            for (int j = 0; j < quot; j++) {
                answer.append(symbols[i]);
            }
        }
        
        return answer.toString();
    }
}