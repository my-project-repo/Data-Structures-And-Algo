class Solution {
    public int climbStairs(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fun(n,dp);
    }
    int fun (int target, int [] dp)
    {
        if (target == 0) return 1;
        if (target < 0) return 0;
        if (dp[target] != -1) return dp[target];
        return dp[target] = fun(target-1,dp) + fun(target-2,dp);
    }
}