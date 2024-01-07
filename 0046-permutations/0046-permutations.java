public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        permute(nums, new ArrayList<>(), answer);
        return answer;
    }

    public void permute(int[] nums, List<Integer> current, List<List<Integer>> answer) {
        if (current.size() == nums.length) {
            answer.add(new ArrayList<>(current));
            return;
        }

        for (int num : nums) {
            if (!current.contains(num)) {
                current.add(num);
                permute(nums, current, answer);
                current.remove(current.size() - 1);
            }
        }
    }
}
