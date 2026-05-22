class Solution {
    public int climbStairs(int n) {
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        return jump(0, n , dp);
    }

    int jump(int i, int n , int [] dp) {
        if (i > n)
            return 0;
        else if (i == n)
            return 1;
            else if (dp[i] != -1) return dp[i];
        else {
            int sum = 0;
            for (int j = 1; j <= 2; j++) {
                sum += jump(i + j, n,dp);
            }
            return dp[i] = sum;
        }

    }
}