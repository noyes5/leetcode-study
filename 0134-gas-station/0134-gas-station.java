class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int curDif = 0;
        int difGas = 0;
        int startIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            difGas = gas[i] - cost[i];
            totalGas += difGas;
            curDif += difGas;

            if (curDif < 0) {
                curDif = 0;
                startIndex = i + 1;
            }
        }

        if (totalGas < 0) {
            return -1;
        }
        return startIndex;
    }
}