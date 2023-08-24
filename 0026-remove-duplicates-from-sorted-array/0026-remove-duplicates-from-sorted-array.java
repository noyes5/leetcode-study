class Solution {
    public int removeDuplicates(int[] nums) {
        int[] deleteDuplicatedNums = Arrays.stream(nums)
                                                .distinct()
                                                .toArray();

        int k = deleteDuplicatedNums.length;

        for (int i = 0; i < k; i++) {
            nums[i] = deleteDuplicatedNums[i];
        }

        return k;
        
    }
}