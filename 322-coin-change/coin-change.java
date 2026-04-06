class Solution {
    public int coinChange(int[] coins, int amount) {
        int m = coins.length;
        int[][] dp = new int[m + 1][amount + 1];
        for (int[] d : dp)
            Arrays.fill(d, -1);
        int res = knap(m, coins, amount, dp);
        return res == Integer.MAX_VALUE - 1 ? -1 : res;
    }

    int knap(int n, int[] coins, int amount, int[][] dp) {
        if (amount == 0)
            return 0;
        else if (n <= 0)return Integer.MAX_VALUE - 1;
        else if (dp[n][amount] != -1)
            return dp[n][amount];
        else if (coins[n-1] <= amount) {
            return dp[n][amount] = Math.min(1 + knap(n, coins, amount - coins[n-1], dp), knap(n-1, coins, amount, dp));
        } else
            return dp[n][amount] = knap(n - 1, coins, amount, dp);

    }
}