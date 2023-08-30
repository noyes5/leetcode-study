import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashTable = new Hashtable<>();
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];

            if (hashTable.containsKey(rest)) {
                answer[0] = i;
                answer[1] = hashTable.get(rest);
                break;
            }

            hashTable.put(nums[i], i);
        }

        return answer;
    }
}