class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        if (nums.length == 1) {
            list.add(nums[0] + "");
            return list;
        }
        int standard = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) { 
            if (nums[i] != standard + count) {
                if (count == 1) {
                    list.add(nums[i - 1] + "");
                } else {
                    list.add(standard + "->" + nums[i - 1]);
                }
                standard = nums[i];
                count = 1;
            } else {
                count++;
            }

            if (i == nums.length - 1) {
                if (count == 1) {
                    list.add(nums[i] + "");
                } else {
                    list.add(standard + "->" + nums[i]);
                }
            }
        }

        return list;
    }
}