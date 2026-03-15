class Solution {
    public int integerBreak(int n) {
        int [][] dp = new int[n+1][n+1];
        for (int [] d : dp) Arrays.fill(d,-1);
        return helper(1,n,n,dp);
    }
    int helper (int idx , int n , int size , int [][] dp)
    {
        if (n == 0) return 1;
        if (n < 0 || idx >= size) return 0;
        if (dp[idx][n] != -1) return dp[idx][n];
        int include = idx * helper(idx,n-idx,size,dp);
        int exclude = helper(idx+1,n,size,dp);
        return dp[idx][n] = Math.max(include,exclude);
    }
}