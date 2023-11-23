class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
    	if (wordDict.size() == 0) {
        	return false;
        }
        Set<String> wordSet = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

         int maxLength = getMaxWordLength(wordDict);

        for (int i = 1; i <= s.length(); i++) {
            for (int j = Math.max(0, i - maxLength); j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
        }
        
        return dp[n];
    }
    private int getMaxWordLength(List<String> wordDict) {
        int maxLength = 0;
        for (String word : wordDict) {
            maxLength = Math.max(maxLength, word.length());
        }
        return maxLength;
    }
}