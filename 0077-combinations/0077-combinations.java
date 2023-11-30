class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        combine(answer, new ArrayList<>(), 1, n, k);

        return answer;
    }

    private void combine(List<List<Integer>> answer, List<Integer> current, int start, int n, int k) {
        if (current.size() == k) {
            answer.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            combine(answer, current, i + 1, n, k);
            current.remove(current.size() - 1);
        }
    }
}