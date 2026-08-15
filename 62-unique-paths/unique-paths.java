class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        for (int [] d : dp) Arrays.fill(d,-1);
        return path(0,0,m,n,dp);
    }

    int path (int r , int c , int m , int n , int [][]dp)
    {
        if (r == m-1 && c == n-1) return 1;
        else if (r >= m || c >= n) return 0;
        else if (dp[r][c] != -1) return dp[r][c];

        int down = path(r+1,c,m,n,dp);
        int right = path(r,c+1,m,n,dp);
        return dp[r][c] = down + right;
    }
}