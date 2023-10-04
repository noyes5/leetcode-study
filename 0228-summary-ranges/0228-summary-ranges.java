class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return new ArrayList<>();
        }

        int start = nums[0];
        int end = start;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < nums.length; i++) { 
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                sb.setLength(0); // StringBuilder 재사용을 위해 길이를 0으로 설정
                if (start == end) {
                    sb.append(start);
                } else {
                    sb.append(start).append("->").append(end);
                }
                list.add(sb.toString());
                start = nums[i];
                end = start;
            }
        }

        sb.setLength(0); 
        if (start == end) {
            sb.append(start);
        } else {
            sb.append(start).append("->").append(end);
        }
        list.add(sb.toString());

        return list;
    }
}