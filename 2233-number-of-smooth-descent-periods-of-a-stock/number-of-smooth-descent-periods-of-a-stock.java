class Solution {
    public long getDescentPeriods(int[] prices) {
        long count = 1;   // first element
        long len = 1;     // current descent length

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] == prices[i - 1] - 1) {
                len++;          // extend descent
            } else {
                len = 1;        // reset
            }
            count += len;
        }

        return count;
    }
}
