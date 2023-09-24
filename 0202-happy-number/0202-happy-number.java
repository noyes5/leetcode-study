class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        Set<Integer> calSet = new HashSet<>();

        while (n != 1 && !calSet.contains(n)) {
            calSet.add(n);
            n = calculate(n);
        }

        return n == 1;
    }

    static int calculate(int n) {
        int sum = 0;
        while (n != 0) {
            int number = n % 10;
            sum += number * number;
            n /= 10;
        }
        return sum;
    }
}