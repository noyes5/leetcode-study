class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                answer[0] = ++left;
                answer[1] = ++right;
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        
        return answer;
    }
}