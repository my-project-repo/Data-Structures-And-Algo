class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] dp = new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(climb(0, cost,dp), climb(1, cost,dp));
    }

    int climb(int i, int[] cost, int[] dp) {
        if (i >= cost.length)
            return 0;
        else if (dp[i] != -1)
            return dp[i];
        else {
            int first = cost[i] + climb(i + 1, cost, dp);
            int second = cost[i] + climb(i + 2, cost, dp);
            return dp[i] = Math.min(first, second);
        }
    }
}