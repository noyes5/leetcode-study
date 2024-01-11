public class Solution {
    List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums, new ArrayList<>());
        return answer;
    }

    public void dfs(int index, int[] nums, List<Integer> subset) {
        answer.add(new ArrayList<>(subset));

        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            dfs(i + 1, nums, subset);
            subset.remove(subset.size() - 1);
        }
    }
}