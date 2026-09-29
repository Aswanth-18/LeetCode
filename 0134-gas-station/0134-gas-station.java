class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int st = 0;
        int rem = 0;
        int tot = 0;

        for (int i = 0; i < gas.length; i++) {
            tot += gas[i] - cost[i];
            rem += gas[i] - cost[i] ;

            if (rem < 0) {
                st = i + 1;
                rem = 0;
            }
        }
        return tot < 0 ? -1 : st;
    }
}