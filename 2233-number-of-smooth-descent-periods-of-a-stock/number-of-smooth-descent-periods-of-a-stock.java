class Solution {
    public long getDescentPeriods(int[] prices) {
        long res = 1, sum = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] - prices[i] == 1) {
                sum++;
            } else
                sum = 1;
            res += sum;
        }
        return res;
    }
}