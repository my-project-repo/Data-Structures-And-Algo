class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return jump(0, n, costs, dp);
    }

    int jump(int i, int n, int[] cost, int[] dp) {
        if (i == n)
            return 0;
        else if (i > n)
            return Integer.MAX_VALUE;
        else if (dp[i] != -1)
            return dp[i];
        else {
            int min = Integer.MAX_VALUE;
            int c = jump(i + 1, n, cost, dp);
            if (c != Integer.MAX_VALUE)
                min = Math.min(min, cost[i] + 1 + c);
            int d = jump(i + 2, n, cost, dp);
            if (d != Integer.MAX_VALUE)
                min = Math.min(min, cost[i + 1] + 4 + d);
            int e = jump(i + 3, n, cost, dp);
            if (e != Integer.MAX_VALUE)
                min = Math.min(min, cost[i + 2] + 9 + e);
            return dp[i] = min;
        }
    }
}