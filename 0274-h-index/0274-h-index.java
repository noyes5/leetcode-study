class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int answer = n;
        Arrays.sort(citations);
        for (int i = 0; i < n; i++) {
            if (citations[i] >= answer) {
                return answer;
            }
            answer--;
        }
        return answer;
    }
}